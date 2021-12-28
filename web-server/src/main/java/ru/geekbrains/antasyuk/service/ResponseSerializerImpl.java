package ru.geekbrains.antasyuk.service;

import ru.geekbrains.antasyuk.domain.HttpResponse;
public class ResponseSerializerImpl implements ResponseSerializer {


    @Override
    public String serialize(HttpResponse response) {
        StringBuilder sb = new StringBuilder();
        sb.append("HTTP/1.1" + response.getStatus().getStatus() + " " + response.getStatus().getName() + "\n");
        response.getHeaders().forEach((header, value) -> {
            sb.append(header + ":  " + value + "\n");
        });
       sb.append("\n");
       sb.append(response.getBody());
        return sb.toString();
    }
}
