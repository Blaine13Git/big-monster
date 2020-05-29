package com.muyi.bigMonster.service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

import lombok.extern.slf4j.Slf4j;
import org.jacoco.core.data.ExecutionDataWriter;
import org.jacoco.core.runtime.RemoteControlReader;
import org.jacoco.core.runtime.RemoteControlWriter;
import org.springframework.stereotype.Service;

/**
 * agent config param output=tcpserver, the collected data is dumped to a local file.
 * test
 */
@Slf4j
@Service
public final class ClientExecDataGenerateService {

    public void execDataGenerate(String ip, Integer port, String destFilePath) throws IOException {
        final FileOutputStream localFile = new FileOutputStream(destFilePath);
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
    }


}
