package com.muyi.bigMonster.net;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

public class ClientService {

    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost",8080);
        socket.setSoTimeout(5000);

        SocketAddress endPoint = new InetSocketAddress("localhost", 9999);
        socket.connect(endPoint,3000);
    }
}
