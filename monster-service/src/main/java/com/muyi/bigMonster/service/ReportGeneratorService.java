package com.muyi.bigMonster.service;

import com.muyi.bigMonster.mapper.daily1.ComplexMetricsProjectInfoMapper;
import com.muyi.bigMonster.mapper.daily1.DiffCoverageReportMapper;
import com.muyi.bigMonster.model.daily1.ComplexMetricsProjectInfo;
import com.muyi.bigMonster.model.daily1.DiffCoverageReport;
import lombok.extern.slf4j.Slf4j;
import org.jacoco.core.analysis.Analyzer;
import org.jacoco.core.analysis.CoverageBuilder;
import org.jacoco.core.analysis.IBundleCoverage;
import org.jacoco.core.analysis.ICounter;
import org.jacoco.core.data.ExecutionDataStore;
import org.jacoco.core.tools.ExecFileLoader;
import org.jacoco.report.DirectorySourceFileLocator;
import org.jacoco.report.FileMultiReportOutput;
import org.jacoco.report.IReportVisitor;
import org.jacoco.report.MultiSourceFileLocator;
import org.jacoco.report.html.HTMLFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * test
 */
@Slf4j
@Service
public class ReportGeneratorService {

    private static final String BASE_REPORT_PATH_SERVER = "/home/jenkins/reports/htmlReports/";
    private static final String BASE_EXEC_PATH_SERVER = "/home/jenkins/reports/execFiles/";

    private static final String BASE_REPORT_PATH_LOCAL = "/Users/changfeng/work/jacoco/reports/htmlReports/";
    private static final String BASE_EXEC_PATH_LOCAL = "/Users/changfeng/work/jacoco/reports/execFiles/";

    private static final String JAVA_SOURCE_PREFIX = "/src/main/java/";

    private ExecFileLoader execFileLoader;
    private File reportDirectory;
    private int recordId;
    private String title;
    private String url;

    @Resource
    private DiffCoverageReportMapper diffCoverageReportMapper;

    @Resource
    private ComplexMetricsProjectInfoMapper projectInfoMapper;

    @Autowired
    private DiffService diffService;

    // 报告生成3步走
    public void create(int id) throws IOException {
        recordId = id;
        /*
        ================数据准备================
         */
        DiffCoverageReport diffCoverageReport = diffCoverageReportMapper.selectByPrimaryKey(id);
        String executionDataFile = diffCoverageReport.getExecfilepath();
        String baseBranch = diffCoverageReport.getBasebranch();
        String diffBranch = diffCoverageReport.getDiffbranch();
        String projectName = diffCoverageReport.getProjectname();

        List<ComplexMetricsProjectInfo> projectInfos = projectInfoMapper.selectByProjectName(projectName);
        url = projectInfos.get(0).getUrl();

        String executionDataFilePath;

        // 项目文件夹名称作为报告的title
        title = diffCoverageReport.getProjectname();

        String basePathReport;
        String basePathClass;
        if (System.getProperty("user.dir").startsWith("/home/jenkins")) {
            basePathReport = BASE_REPORT_PATH_SERVER;
            basePathClass = "/home/jenkins/codes/";
            executionDataFilePath = BASE_EXEC_PATH_SERVER + title + "/" + executionDataFile;
        } else {
            basePathReport = BASE_REPORT_PATH_LOCAL;
            basePathClass = "/Users/changfeng/work/jacoco/codes/";
            executionDataFilePath = BASE_EXEC_PATH_LOCAL + title + "/" + executionDataFile;
        }

        // 指定class文件的路径和项目路径相同
        String classesPath = basePathClass + title;

        // 指定报告存放的位置
        reportDirectory = new File(basePathReport + "/" + title);
        if (!reportDirectory.exists()) {
            reportDirectory.mkdir();
        }

        // 1、加载exec文件
        loadExecutionData(executionDataFilePath);

        // 2、分析
        final IBundleCoverage bundleCoverage = analyzeStructure(classesPath, baseBranch, diffBranch);

        // 3、创建报告
        createReport(bundleCoverage, classesPath);

        // 4、部分信息入库
        int diffSize = diffService.getDiffEntriesByBranch(classesPath, baseBranch, diffBranch).size();
        int addSize = diffService.getAdd(classesPath, baseBranch, diffBranch).size();
        int modifySize = diffService.getModify(classesPath, baseBranch, diffBranch).size();
        int delSize = diffService.getDelete(classesPath, baseBranch, diffBranch).size();

        DiffCoverageReport record = new DiffCoverageReport();
        record.setDiffclassfilenumber(diffSize + "");
        record.setAddfilenumber(addSize + "");
        record.setModifyfilenumber(modifySize + "");
        record.setDeletefilenumber(delSize + "");
        record.withId(id);

        diffCoverageReportMapper.updateByPrimaryKeySelective(record);
    }

    // 加载exec文件
    private void loadExecutionData(String executionDataFilePath) throws IOException {
        File executionDataFile = new File(executionDataFilePath);
        execFileLoader = new ExecFileLoader();
        execFileLoader.load(executionDataFile);
    }

    // 分析
    private IBundleCoverage analyzeStructure(String classesPath, String baseBranch, String diffBranch) throws IOException {

        File classesDirectory = new File(classesPath);

        String gitPath = classesPath + "/.git";

//        final CoverageBuilder coverageBuilder = new CoverageBuilder();
        final CoverageBuilder coverageBuilder = new CoverageBuilder(gitPath, diffBranch, baseBranch);

        ExecutionDataStore executionDataStore = execFileLoader.getExecutionDataStore();

        final Analyzer analyzer = new Analyzer(executionDataStore, coverageBuilder);

//        analyzer.analyzeAll(classesDirectory, baseBranch, diffBranch);
        analyzer.analyzeAll(classesDirectory);

/*
        for (final IClassCoverage cc : coverageBuilder.getClasses()) {
            System.out.printf("Coverage of class %s%n", cc.getName());

            printCounter("instructions-指令", cc.getInstructionCounter());
            printCounter("branches-分支", cc.getBranchCounter());
            printCounter("lines-行", cc.getLineCounter());
            printCounter("methods-方法", cc.getMethodCounter());
            printCounter("complexity-复杂", cc.getComplexityCounter());

        }
*/

        return coverageBuilder.getBundle(title);
    }

    // 创建报告
    private void createReport(final IBundleCoverage bundleCoverage, String projectPath) throws IOException {

        final HTMLFormatter htmlFormatter = new HTMLFormatter();

        final IReportVisitor visitor = htmlFormatter.createVisitor(new FileMultiReportOutput(reportDirectory));

        visitor.visitInfo(execFileLoader.getSessionInfoStore().getInfos(), execFileLoader.getExecutionDataStore().getContents());

        //多源码路径
        File projectPathFile = new File(projectPath);

        MultiSourceFileLocator sourceLocator = new MultiSourceFileLocator(4);

        List<String> modelNameList = getModelName(projectPathFile);
        for (String modelName : modelNameList) {
            sourceLocator.add(new DirectorySourceFileLocator(new File(projectPathFile, modelName + JAVA_SOURCE_PREFIX), "utf-8", modelNameList.size()));
        }

        visitor.visitBundle(bundleCoverage, sourceLocator);
        visitor.visitEnd();

        // 更新生成的报告
        DiffCoverageReport record = new DiffCoverageReport();
        record.setReporturl(title + "/index.html");
        record.withId(recordId);

        diffCoverageReportMapper.updateByPrimaryKeySelective(record);

    }

    private void printCounter(final String unit, final ICounter counter) {
        final Integer missed = Integer.valueOf(counter.getMissedCount());
        final Integer total = Integer.valueOf(counter.getTotalCount());
        System.out.printf("%n%s of %s %s missed%n", missed, total, unit);
    }

    private List<String> getModelName(File file) {

        List<String> modelNameList = new ArrayList<>();

        for (File fileChild : file.listFiles()) {
            if (fileChild.isDirectory()) {
                for (File filePOM : fileChild.listFiles()) {
                    if (filePOM.getName().equals("pom.xml")) {
                        modelNameList.add(fileChild.getName());
                    }
                }
            }
        }
        return modelNameList;
    }

}
