package com.galenus.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;

@Slf4j
@Configuration
public class DatabaseConfig {

    public DatabaseConfig() {
        // empty constructor
    }

    private static final String USERNAME = "galenus4";

    private static final String PASSWORD = "g@lenus-4";


    private static final String DATABASE_URL = "jdbc:mysql://db4free.net:3306/galenus";

    public static Connection createConnectionToMySQL() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
    }
}

