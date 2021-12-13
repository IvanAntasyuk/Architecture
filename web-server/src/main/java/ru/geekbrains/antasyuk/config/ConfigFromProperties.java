package ru.geekbrains.antasyuk.config;

import java.io.IOException;
import java.util.Properties;

public class ConfigFromProperties implements Config {
    private final String getWwwHome;
    private final int getPort;

    public ConfigFromProperties(String fileName) {
        Properties properties = new Properties();
        try {
            properties.load(getClass().getResourceAsStream(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.getWwwHome = properties.getProperty("www.home");
        this.getPort = Integer.parseInt(properties.getProperty("port"));
    }

    @Override
    public String getWwwHome() {
        return this.getWwwHome;
    }

    @Override
    public int getPort() {
        return this.getPort;
    }
}
