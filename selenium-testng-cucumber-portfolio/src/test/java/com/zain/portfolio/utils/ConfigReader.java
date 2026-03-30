package com.zain.portfolio.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public final class ConfigReader {
    private static final Properties PROPERTIES = new Properties();

    static {
        try (InputStream inputStream = ConfigReader.class.getClassLoader()
                .getResourceAsStream("config/config.properties")) {
            if (inputStream == null) {
                throw new IllegalStateException("config.properties not found in classpath");
            }
            PROPERTIES.load(inputStream);
        } catch (IOException exception) {
            throw new RuntimeException("Unable to load configuration", exception);
        }
    }

    private ConfigReader() {
    }

    public static String get(String key) {
        return PROPERTIES.getProperty(key);
    }
}
