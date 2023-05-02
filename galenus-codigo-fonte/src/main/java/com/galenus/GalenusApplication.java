package com.galenus;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import javax.swing.*;
import java.awt.*;

@SpringBootApplication
public class GalenusApplication extends JFrame {

    public static void main(String[] args) {
        var ctx = new SpringApplicationBuilder(GalenusApplication.class)
                .headless(false).run(args);

        EventQueue.invokeLater(() -> {
            var ex = ctx.getBean(GalenusApplication.class);
            ex.setVisible(true);
        });
    }
}
