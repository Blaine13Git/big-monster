package com.muyi.bigMonster.net;

import lombok.Data;

@Data
public class UrlRequest {
    private String srcHostAddress;
    private int srcPort;

    private String desHostName;
    private int desPort;

    private String userAgent;

    private String requestMethod;
    private String requestVersion; // HTTP/1.1
    private String requestUri;
    private String requestData;

}
