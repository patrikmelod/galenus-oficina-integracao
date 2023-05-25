package com.galenus;

import com.galenus.telas.Login;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import javax.swing.*;
import java.awt.*;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.galenus")
@ComponentScan(basePackages = { "com.galenus" })
@EntityScan("com.galenus")
public class GalenusApplication extends JFrame {
    
    public GalenusApplication() {
        // empty constructor
    }

    public static void main(String[] args) {
        var ctx = new SpringApplicationBuilder(GalenusApplication.class)
                .headless(false).run(args);
        EventQueue.invokeLater(() -> {
            var ex = ctx.getBean(Login.class);
            ex.setVisible(true);
        });
    }
   
}
