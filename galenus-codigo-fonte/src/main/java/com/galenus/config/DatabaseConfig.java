package com.galenus.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import java.io.IOException;
import lombok.extern.slf4j.Slf4j;

import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class DatabaseConfig {

    public DatabaseConfig() {
        // empty constructor
    }

    @Bean
    public DataSource dataSource() throws IOException {
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setDriverClassName("com.mysql.cj.jdbc.Driver");
        hikariConfig.setJdbcUrl("jdbc:mysql://db4free.net:3306/galenus");
        hikariConfig.setUsername("galenus4");
        hikariConfig.setPassword("g@lenus-4");
        return new HikariDataSource(hikariConfig);
    }

}
