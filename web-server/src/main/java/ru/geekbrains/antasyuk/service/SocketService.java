package ru.geekbrains.antasyuk.service;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Deque;
import java.util.LinkedList;

public class SocketService implements Closeable {

    private final Socket socket;

    public SocketService(Socket socket) {
        this.socket = socket;
    }

    public Deque<String> readRequest() {
        Deque<String> request = new LinkedList<>();
        try {
            BufferedReader input = new BufferedReader(
                    new InputStreamReader(
                            socket.getInputStream(), StandardCharsets.UTF_8));

            while (!input.ready()) ;

            while (input.ready()) {
                String line = input.readLine();
                System.out.println(line);
                request.add(line);

            }
            return request;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return request;
    }

    public void sendResponse(String send) {
        try {
            PrintWriter output = new PrintWriter(socket.getOutputStream());
            output.print(send);
            output.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    @Override
    public void close() throws IOException {
        if (!socket.isClosed()){
            socket.close();
        }

    }
}
