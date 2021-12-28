package ru.geekbrains.antasyuk.service;

import ru.geekbrains.antasyuk.domain.HttpResponse;

public interface ResponseSerializer {
    String serialize(HttpResponse response);
}
