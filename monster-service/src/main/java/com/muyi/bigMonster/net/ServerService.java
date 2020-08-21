package com.muyi.bigMonster.net;

import java.io.*;
import java.net.*;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ServerService {

    public static void main(String[] args) {
        ServerService serverService = new ServerService();
        try {

//            serverService.urlInterceptor();

            serverService.doGet("https://www.baidu.com");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void localServer() {
        try (ServerSocket server = new ServerSocket(9988)) {

            try (Socket client = server.accept()) {
                // 数据对象
                InputStream inputStream = client.getInputStream(); // 输入流
                OutputStream outputStream = client.getOutputStream(); // 输出流

                // 操作数据的对象
                try (Scanner in = new Scanner(inputStream, "UTF-8");
                     PrintWriter out = new PrintWriter(new OutputStreamWriter(outputStream, "UTF-8"), true)) {

                    out.println("Hello," + InetAddress.getByName("localhost") + " Enter bye to exit"); // ?

                    boolean exit = false;
                    boolean hasNextLine = in.hasNextLine();
                    while (!exit && hasNextLine) {
                        String line = in.nextLine();
                        out.println(">>>: " + line);

                        if (line.trim().toLowerCase().equals("bye")) {
                            exit = true;
                        }
                    }

                }
            }

        } catch (Exception e) {

        }
    }

    // 多线程接入服务端，为每个请求创建一个线程
    public void localServerThread() {
        try {
            ServerSocket server = new ServerSocket(9988);
            while (true) {
                Runnable target = new ServerThread(server.accept());
                Thread thread = new Thread(target);
                thread.start();
            }

        } catch (Exception e) {

        }
    }

    class ServerThread implements Runnable {
        private Socket socket;

        public ServerThread(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            try (InputStream inputStream = socket.getInputStream(); OutputStream outputStream = socket.getOutputStream()) {
                Scanner in = new Scanner(inputStream, "UTF-8");
                PrintWriter out = new PrintWriter(new OutputStreamWriter(outputStream, "UTF-8"));
                out.println(">>> ");

                boolean exit = false;
                boolean hasNextLine = in.hasNextLine();
                while (!exit && hasNextLine) {
                    String line = in.nextLine();
                    out.println("~: " + line);

                    if (line.trim().toLowerCase().equals("bye")) {
                        exit = true;
                    }
                }

            } catch (Exception e) {

            }
        }
    }


    public void urlInterceptor() throws Exception {

        // 创建一个线程池，线程个数=10
        ExecutorService threadPool = Executors.newFixedThreadPool(10);

        // 创建服务端监听，端口号=9988
        ServerSocket server = new ServerSocket(9988);

        while (true) {
            Socket client = server.accept();
            Future result = threadPool.submit(new ClientHolder(client));

        }


    }


    class ClientHolder implements Callable {
        private Socket client;

        public ClientHolder(Socket client) {
            this.client = client;
        }

        @Override
        public Object call() throws Exception {

            String srcAddress = client.getInetAddress().getHostAddress();
            int port = client.getPort();
            System.out.println(srcAddress + ":" + port + " 接入……");

            InputStream inputStream = client.getInputStream(); // 输入流
            OutputStream outputStream = client.getOutputStream(); // 输出流

            Scanner scanner = new Scanner(inputStream, "UTF-8");
            UrlRequest request = new UrlRequest();
            int lineNum = 0;
            while (scanner.hasNextLine()) {
                lineNum++;
                if (lineNum == 1) {
                    // 请求行
                    String requestLine = scanner.nextLine();
                    System.out.println("requestLine:" + requestLine);

                    String[] splitRequestLine = requestLine.split(" ");

                    request.setRequestMethod(splitRequestLine[0]);
                    request.setRequestUri(splitRequestLine[1]);
                    request.setRequestVersion(splitRequestLine[2]);

                } else {
                    if (scanner.nextLine().trim().isEmpty()) {
                        request.setRequestData(scanner.nextLine()); // 消息体
                    } else {
                        // 消息头
                    }
                }

//                doPost()

            }

            String urlString = "";

            URLConnection connection = new URL(urlString).openConnection();
            connection.setRequestProperty("", "");
            connection.setDoOutput(true);
            connection.connect();
            return null;
        }
    }

    /**
     * post 请求
     *
     * @param url
     * @param parameters
     * @param userAgent
     * @param redirects
     * @return
     * @throws Exception
     */
    public String doPost(URL url, Map<Object, Object> parameters, String userAgent, int redirects) throws Exception {

        // 1、打开链接
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        // 1.1、打开链接后的其他设置
        if (userAgent != null) {
            connection.setRequestProperty("User-Agent", userAgent);
        }

        if (redirects >= 0) {
            connection.setInstanceFollowRedirects(false);
        }

        // 2、开启向服务端写的功能
        connection.setDoOutput(true);

        // 2.1、向服务端写请求参数
        try (PrintWriter out = new PrintWriter(connection.getOutputStream())) {
            boolean first = true;

            for (Map.Entry<Object, Object> parameter : parameters.entrySet()) {
                if (first) {
                    first = false;
                } else {
                    out.println('&');
                }

                String key = parameter.getKey().toString();
                String value = parameter.getValue().toString();

                out.print(key);
                out.print('=');
                out.print(URLEncoder.encode(value, "UTF-8"));
            }
        }

        // 3、判断请求结果
        String encoding = connection.getContentEncoding();
        if (encoding == null) {
            encoding = "UTF-8";
        }

        if (redirects > 0) {
            int responseCode = connection.getResponseCode();

            // 重定向
            if (responseCode == HttpURLConnection.HTTP_MOVED_PERM ||
                    responseCode == HttpURLConnection.HTTP_MOVED_TEMP ||
                    responseCode == HttpURLConnection.HTTP_SEE_OTHER) {
                String location = connection.getHeaderField("Location");
                if (location != null) {
                    URL base = connection.getURL();
                    connection.disconnect();
                    return doPost(new URL(base, location), parameters, userAgent, redirects - 1);
                }
            }
        } else if (redirects == 0) {
            throw new IOException("Too many redirects");
        }

        // 4、获取请求响应，并返回字符串
        StringBuilder response = new StringBuilder();
        try (Scanner in = new Scanner(connection.getInputStream(), encoding)) {
            while (in.hasNextLine()) {
                response.append(in.nextLine());
                response.append("\n");
            }
        } catch (IOException e) {
            InputStream errorStream = connection.getErrorStream();
            if (errorStream == null) {
                throw e;
            }
            try (Scanner in = new Scanner(errorStream)) {
                response.append(in.nextLine());
                response.append("\n");
            }
        }
        return response.toString();
    }

    public String doGet(String requestURL) {
        try {
            HttpURLConnection connection = (HttpURLConnection) new URL(requestURL).openConnection();

            boolean hasHeaderField = true;
            int headerFieldSize = 0;
            while (hasHeaderField) {

                String headerField = connection.getHeaderField(headerFieldSize);
                headerFieldSize++;
                if (headerField == null || headerField.isEmpty()) {
                    hasHeaderField = false;
                }
                System.out.println(headerField);
            }

            InputStream inputStream = connection.getInputStream();
            Scanner in = new Scanner(inputStream);
            while (in.hasNextLine()) {
                String line = in.nextLine();
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
