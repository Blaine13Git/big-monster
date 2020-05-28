/*******************************************************************************
 * Copyright (c) 2009, 2020 Mountainminds GmbH & Co. KG and Contributors
 * This program and the accompanying materials are made available under
 * the terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Brock Janiczak - initial API and implementation
 *
 *******************************************************************************/
package com.muyi.bigMonster.service;


import org.jacoco.core.analysis.Analyzer;
import org.jacoco.core.analysis.CoverageBuilder;
import org.jacoco.core.analysis.IBundleCoverage;
import org.jacoco.core.data.ExecutionDataStore;
import org.jacoco.core.tools.ExecFileLoader;
import org.jacoco.report.DirectorySourceFileLocator;
import org.jacoco.report.FileMultiReportOutput;
import org.jacoco.report.IReportVisitor;
import org.jacoco.report.MultiSourceFileLocator;
import org.jacoco.report.html.HTMLFormatter;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * This example creates a HTML report for eclipse like projects based on a
 * single execution data store called jacoco.exec. The report contains no
 * grouping information.
 * <p>
 * The class files under test must be compiled with debug information, otherwise
 * source highlighting will not work.
 */
public class ReportGenerator {
    private static final String JAVA_SOURCE_PREFIX = "/src/main/java/";
//    private static final String CLASS_SOURCE_PREFIX = "target/classes/";

    private final String title;

    private final File executionDataFile;
    private final File classesDirectory;
    private final File sourceDirectory;
    private final File reportDirectory;

    private ExecFileLoader execFileLoader;

    public ReportGenerator(final File projectDirectory, String classFile) {
        this.title = projectDirectory.getName();
        this.executionDataFile = new File(projectDirectory, "jacoco-client.exec");
        this.reportDirectory = new File(projectDirectory, "reportCoverage");
        this.classesDirectory = new File(projectDirectory, "");
        this.sourceDirectory = new File(projectDirectory, "");
    }

    // 组织创建3步
    public void create() throws IOException {

        // 加载exec文件
        loadExecutionData();

        // 分析
        final IBundleCoverage bundleCoverage = analyzeStructure();

        // 创建报告
        createReport(bundleCoverage);

    }

    // 加载exec文件
    private void loadExecutionData() throws IOException {
        execFileLoader = new ExecFileLoader();
        execFileLoader.load(executionDataFile);
    }

    // 分析
    private IBundleCoverage analyzeStructure() throws IOException {

        final CoverageBuilder coverageBuilder = new CoverageBuilder();

        ExecutionDataStore executionDataStore = execFileLoader.getExecutionDataStore();

        final Analyzer analyzer = new Analyzer(executionDataStore, coverageBuilder);

//        analyzer.analyzeAll(classesDirectory);
        analyzer.analyzeAll(classesDirectory, "master", "test");

        return coverageBuilder.getBundle(title);
    }

    // 创建报告
    private void createReport(final IBundleCoverage bundleCoverage) throws IOException {

        final HTMLFormatter htmlFormatter = new HTMLFormatter();

        final IReportVisitor visitor = htmlFormatter.createVisitor(new FileMultiReportOutput(reportDirectory));

        visitor.visitInfo(execFileLoader.getSessionInfoStore().getInfos(), execFileLoader.getExecutionDataStore().getContents());

//        DirectorySourceFileLocator sourceFileLocator = new DirectorySourceFileLocator(sourceDirectory, "utf-8", 4);
//        visitor.visitBundle(bundleCoverage, sourceFileLocator);

        //多源码路径
        String projectPathString = System.getProperty("user.dir");
        File projectPathFile = new File(projectPathString);

//        File sourceDirectory1 = new File(projectPathFile, "monster-data/src/main/java/");
//        File sourceDirectory2 = new File(projectPathFile, "monster-service/src/main/java/");
//        File sourceDirectory3 = new File(projectPathFile, "monster-web/src/main/java/");

        MultiSourceFileLocator sourceLocator = new MultiSourceFileLocator(4);

//        sourceLocator.add(new DirectorySourceFileLocator(sourceDirectory1, "utf-8", 4));
//        sourceLocator.add(new DirectorySourceFileLocator(sourceDirectory2, "utf-8", 4));
//        sourceLocator.add(new DirectorySourceFileLocator(sourceDirectory3, "utf-8", 4));


        List<String> modelNameList = getModelName(projectPathFile);
        for (String modelName : modelNameList) {
            sourceLocator.add(new DirectorySourceFileLocator(new File(projectPathFile, modelName + JAVA_SOURCE_PREFIX), "utf-8", modelNameList.size()));
        }

        visitor.visitBundle(bundleCoverage, sourceLocator);

        visitor.visitEnd();

    }


    public int analyzeAll(final File file, String baseBranch, String diffBranch) throws IOException {

        int count = 0;
        if (file.isDirectory()) {
            for (final File f : file.listFiles()) {
                count += analyzeAll(f, baseBranch, diffBranch);
            }
        } else {

            // 只分析被改动过的文件
            String absolutePath = file.getAbsolutePath();
            String projectPath = System.getProperty("user.dir");
            String projectClassPath = projectPath + "/";
            String relativePath = absolutePath.replace(projectClassPath, "");
            String classNamePlus = relativePath.replace(".class", ".java");

            if (classNamePlus.contains("/target/classes/")) {
                int index = classNamePlus.indexOf("/target/classes/", 0) + 16;
                String mockClassName = classNamePlus.substring(index);
                if (new DiffService().isDiff(mockClassName, baseBranch, diffBranch)) {

                    System.out.println("OK");
                    System.out.println(">>> mockClassName >>> " + mockClassName);
                    count++;
                }
            }
        }
        System.out.println("============" + count + "============");
        return count;
    }


    public static void main(final String[] args) throws Exception {

        String projectDirectory = System.getProperty("user.dir");
        File file = new File(projectDirectory);
        final ReportGenerator generator = new ReportGenerator(file, "");

        generator.create();

//        generator.report01();

//        List<String> modelNameList = generator.getModelName(file);
//        for (String modelName : modelNameList) {
//            System.out.println(modelName);
//        }

    }

    private void report01() throws IOException {

        analyzeAll(classesDirectory, "master", "test");

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
