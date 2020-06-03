package com.muyi.bigMonster.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Date;

import com.muyi.bigMonster.mapper.daily1.DiffCoverageReportMapper;
import com.muyi.bigMonster.mapper.daily1.ProjectServerInfoMapper;
import com.muyi.bigMonster.model.daily1.DiffCoverageReport;
import com.muyi.bigMonster.model.daily1.ProjectServerInfo;
import com.muyi.bigMonster.model.daily1.ProjectServerInfoExample;
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

    private static final String BASE_PATH_SERVER = "/home/jenkins/reports/execFiles/";
    private static final String BASE_PATH_LOCAL = "/Users/changfeng/work/jacoco/reports/execFiles/";

    @Resource
    private DiffCoverageReportMapper diffCoverageReportMapper;

    @Resource
    private ProjectServerInfoMapper projectServerInfoMapper;


    public void execDataGenerate(String projectName, String baseBranch, String diffBranch) throws IOException {

        String basePath;
        String ip;
        int port;
        if (System.getProperty("user.dir").startsWith("/home/jenkins")) {
            basePath = BASE_PATH_SERVER;
            ProjectServerInfoExample example = new ProjectServerInfoExample();
            example.createCriteria().andProjectNameEqualTo(projectName);
            ProjectServerInfo projectServerInfo = projectServerInfoMapper.selectByExample(example).get(0);
            ip = projectServerInfo.getIp();
            port = projectServerInfo.getPort();
        } else {
            basePath = BASE_PATH_LOCAL;
            ip = "localhost";
            port = 10000;
        }

        String destFilePathString = basePath + projectName;
        File destFilePath = new File(destFilePathString);

        if (!destFilePath.exists()) {
            destFilePath.mkdir();
        }

        String execFileName = destFilePathString + "/jacoco_" + projectName + ".exec";
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
        record.setExecfilepath(execFileName);
        record.setCreatetime(new Date());
        record.setUpdatetime(new Date());

        diffCoverageReportMapper.insert(record);
    }


}
