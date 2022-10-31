package com.zqxy.server.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author shkstart
 * @Create 2022-10-31  13:38
 */
@SpringBootApplication
@EnableFeignClients
public class AppOrder {
    public static void main(String[] args) {
        SpringApplication.run(AppOrder.class);
    }
}
