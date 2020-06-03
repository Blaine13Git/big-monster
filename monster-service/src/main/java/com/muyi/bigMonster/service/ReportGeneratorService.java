package com.muyi.bigMonster.service;

import lombok.extern.slf4j.Slf4j;
import org.jacoco.core.analysis.*;
import org.jacoco.core.data.ExecutionDataStore;
import org.jacoco.core.tools.ExecFileLoader;
import org.jacoco.report.DirectorySourceFileLocator;
import org.jacoco.report.FileMultiReportOutput;
import org.jacoco.report.IReportVisitor;
import org.jacoco.report.MultiSourceFileLocator;
import org.jacoco.report.html.HTMLFormatter;
import org.springframework.stereotype.Service;

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

    private static final String BASE_PATH_SERVER = "/home/jenkins/reports/htmlReports/";
    private static final String BASE_PATH_LOCAL = "/Users/changfeng/work/jacoco/reports/htmlReports/";

    private static final String JAVA_SOURCE_PREFIX = "/src/main/java/";

    private String title;

    private File reportDirectory;

    private ExecFileLoader execFileLoader;

    // 报告生成3步走
    public void create(String executionDataFilePath, String projectPath) throws IOException {

        /*
        ================数据准备================
         */

        // 项目文件夹名称作为报告的title
        title = new File(projectPath).getName();

        // 指定class文件的路径和项目路径相同
        String classesPath = projectPath;

        // 指定报告存放的位置
        String basePath;
        if (System.getProperty("user.dir").startsWith("/home/jenkins")) {
            basePath = BASE_PATH_SERVER;
        } else {
            basePath = BASE_PATH_LOCAL;
        }
        reportDirectory = new File(basePath + "/" + title);
        if (!reportDirectory.exists()) {
            reportDirectory.mkdir();
        }

        // 1、加载exec文件
        loadExecutionData(executionDataFilePath);

        // 2、分析
        final IBundleCoverage bundleCoverage = analyzeStructure(classesPath);

        // 3、创建报告
        createReport(bundleCoverage, projectPath);

    }

    // 加载exec文件
    private void loadExecutionData(String executionDataFilePath) throws IOException {
        File executionDataFile = new File(executionDataFilePath);
        execFileLoader = new ExecFileLoader();
        execFileLoader.load(executionDataFile);
    }

    // 分析
    private IBundleCoverage analyzeStructure(String classesPath) throws IOException {

        File classesDirectory = new File(classesPath);

        final CoverageBuilder coverageBuilder = new CoverageBuilder();

        ExecutionDataStore executionDataStore = execFileLoader.getExecutionDataStore();

        final Analyzer analyzer = new Analyzer(executionDataStore, coverageBuilder);

        analyzer.analyzeAll(classesDirectory, "master", "test");

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
