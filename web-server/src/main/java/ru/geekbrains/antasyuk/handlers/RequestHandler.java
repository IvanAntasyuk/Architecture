package ru.geekbrains.antasyuk.handlers;

import ru.geekbrains.antasyuk.config.Config;
import ru.geekbrains.antasyuk.config.ConfigFromProperties;
import ru.geekbrains.antasyuk.domain.HttpRequest;
import ru.geekbrains.antasyuk.service.SocketService;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Deque;


public class RequestHandler implements Runnable {

    private final SocketService socketService;
    private final RequestParser requestParser;
    Config config = new ConfigFromProperties("server.properties");

    public RequestHandler(SocketService socketService, RequestParser requestParser,Config config) {
        this.requestParser = requestParser;
        this.socketService = socketService;
        this.config = config;
    }

    @Override
    public void run() {
        Deque<String> rawRequest = socketService.readRequest();
        HttpRequest httpRequest = requestParser.parseRequest(rawRequest);

        if (httpRequest.getMethod().equals("GET")) {
            Path path = Paths.get(config.getWwwHome(), httpRequest.getUrl());
            if (!Files.exists(path)) {
                StringBuilder res = new StringBuilder();
                res.append("HTTP/1.1 404 NOT_FOUND\n");
                res.append("Content-Type: text/html; charset=utf-8\n");
                res.append("\n");
                res.append("<h1>Файл не найден!</h1>\n");
                socketService.sendResponse(res.toString());
                return;
            }
                StringBuilder res = new StringBuilder();
            res.append("HTTP/1.1 200 OK\n");
            res.append("Content-Type: text/html; charset=utf-8\n");
            res.append("\n");

            try {
                Files.readAllLines(path).forEach(res::append);
            } catch (IOException e) {
                e.printStackTrace();
            }
            socketService.sendResponse(res.toString());
        }
        System.out.println("Client disconnected!");
    }
}
