package com.example.spring_gateway;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "uri.http")
public class UriConfiguration {
    private String httpbin = "http://httpbin.org:80";

    public String getHttpbin(){
        return httpbin;
    }

    public void setHttpbin(String httpbin){
        this.httpbin = httpbin;
    }
}
