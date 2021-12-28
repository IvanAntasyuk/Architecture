package ru.geekbrains.antasyuk.domain;

public enum ResponseCode {
    OK(200, "OK"),
    BAD_REQUEST(400,"BAD REQUEST"),
    METHOD_NOT_ALLOWED(405,"METHOD NOT ALLOWED"),
    NOT_FOUND(404,"NOT FOUND");

   final int status;
   final String name;

    ResponseCode(int status, String name) {
        this.status = status;
        this.name = name;
    }

    public int getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }
}
