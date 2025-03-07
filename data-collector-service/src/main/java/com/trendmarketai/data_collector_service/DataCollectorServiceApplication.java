package com.trendmarketai.data_collector_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import java.util.Scanner;

@SpringBootApplication
public class DataCollectorServiceApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DataCollectorServiceApplication.class, args);

        // Simples lógica para parar a aplicação ao pressionar ENTER
        System.out.println("Press ENTER to close...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        context.close();
    }
}