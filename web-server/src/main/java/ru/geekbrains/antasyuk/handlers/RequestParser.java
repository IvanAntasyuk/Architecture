package ru.geekbrains.antasyuk.handlers;

import ru.geekbrains.antasyuk.domain.HttpRequest;

import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class RequestParser {
    public HttpRequest parseRequest(Deque<String> request){
        String [] firstLine = request.pollFirst().split(" ");
        String method = firstLine[0];
        String url = firstLine[1];

        Map<String,String> headers = new HashMap<>();
        while (request.isEmpty()){
            String line = request.pollFirst();
            if (line.isBlank()){
                break;
            }

            String[] header = line.split(": ");
            headers.put(header[0],header[1]);
        }
        StringBuilder sb = new StringBuilder();
        while (request.isEmpty()){
            sb.append(request.pollFirst());
        }
        return new HttpRequest(method,url,headers,sb.toString());
    }
}
