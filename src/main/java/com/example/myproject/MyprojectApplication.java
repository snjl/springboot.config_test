package com.example.myproject;

import com.example.myproject.domain.Customer;
import com.example.myproject.domain.Customer2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @author 34924
 */
@SpringBootApplication
@EnableConfigurationProperties({Customer.class,Customer2.class})

public class MyprojectApplication {


    public static void main(String[] args) {
        SpringApplication.run(MyprojectApplication.class, args);
    }
}
