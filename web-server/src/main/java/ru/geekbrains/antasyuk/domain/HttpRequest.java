package ru.geekbrains.antasyuk.domain;

import java.util.HashMap;
import java.util.Map;

public class HttpRequest {
    private final String method;

    private final String url;

    private final Map<String,String> headers;

    private final String body;

    public HttpRequest(String method, String url, Map<String, String> headers, String body) {
        this.method = method;
        this.url = url;
        this.headers = headers;
        this.body = body;
    }

    public String getMethod() {
        return method;
    }

    public String getUrl() {
        return url;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public String getBody() {
        return body;
    }

    public static Builder createBuilder(){
        return new Builder();
    }

    public static class Builder {

        private final Map<String, String> headers = new HashMap<>();

        private String body;

        private  String method;

        private  String url;

        private Builder() {
        }

        public Builder withMethod(String method) {
            this.method = method;
            return this;
        }

        public Builder withUrl(String url) {
            this.url = url;
            return this;
        }

        public Builder withHeader(String header, String value) {
            this.headers.put(header, value);
            return this;
        }

        public Builder withBody(String body) {
            this.body = body;
            return  this;
        }

        public HttpRequest build(){
            return new HttpRequest(method,url,headers,body);
        }
    }

}
