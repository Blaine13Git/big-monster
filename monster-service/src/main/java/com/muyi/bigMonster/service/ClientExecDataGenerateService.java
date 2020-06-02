package com.muyi.bigMonster.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

import com.muyi.bigMonster.mapper.daily1.DiffCoverageReportMapper;
import com.muyi.bigMonster.model.daily1.DiffCoverageReport;
import lombok.extern.slf4j.Slf4j;
import org.jacoco.core.data.ExecutionDataWriter;
import org.jacoco.core.runtime.RemoteControlReader;
import org.jacoco.core.runtime.RemoteControlWriter;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * agent config param output=tcpserver, the collected data is dumped to a local file.
 * test
 */
@Slf4j
@Service
public final class ClientExecDataGenerateService {

    private static final String BASE_PATH = "/home/jenkins/reports/execFiles/";

    @Resource
    private DiffCoverageReportMapper diffCoverageReportMapper;


    public void execDataGenerate(String projectName, String baseBranch, String diffBranch) throws IOException {

        String ip = "192.168.2.26";
        int port = 10000;

        String destFilePathString = BASE_PATH + projectName;
        File destFilePath = new File(destFilePathString);

        if (!destFilePath.exists()) {
            destFilePath.mkdir();
        }

        String execFileName = destFilePathString + "jacoco_" + projectName + ".exec";
        System.out.println("execFileName: " + execFileName);

        final FileOutputStream localFile = new FileOutputStream(execFileName);
        final ExecutionDataWriter localWriter = new ExecutionDataWriter(localFile);

        // Open a socket to the coverage agent:
        final Socket socket = new Socket(InetAddress.getByName(ip), port);
        final RemoteControlWriter writer = new RemoteControlWriter(socket.getOutputStream());
        final RemoteControlReader reader = new RemoteControlReader(socket.getInputStream());
        reader.setSessionInfoVisitor(localWriter);
        reader.setExecutionDataVisitor(localWriter);

        // Send a dump command and read the response:
        writer.visitDumpCommand(true, false);
        if (!reader.read()) {
            throw new IOException("Socket closed unexpectedly.");
        }
        socket.close();
        localFile.close();

        DiffCoverageReport record = new DiffCoverageReport();
        record.setProjectname(projectName);
        record.setBasebranch(baseBranch);
        record.setDiffbranch(diffBranch);

        diffCoverageReportMapper.insert(record);
    }


}
