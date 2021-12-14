package ru.geekbrains.antasyuk;

import ru.geekbrains.antasyuk.config.Config;
import ru.geekbrains.antasyuk.config.ConfigFromProperties;
import ru.geekbrains.antasyuk.handlers.RequestHandler;
import ru.geekbrains.antasyuk.handlers.RequestParser;
import ru.geekbrains.antasyuk.service.SocketService;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import static ru.geekbrains.antasyuk.сonstants.Constant.PORT;

public class WebServer {

    public static void main(String[] args) {
        Config config = new ConfigFromProperties("./../../../../server.properties");
        try (ServerSocket serverSocket = new ServerSocket(config.getPort())) {
            System.out.println("Server started!");
            RequestParser requestParser = new RequestParser();

            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("New client connected!");

                new Thread(new RequestHandler(new SocketService(socket),requestParser,config)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}