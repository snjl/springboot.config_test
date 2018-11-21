package com.example.myproject.domain.impl;

import com.example.myproject.domain.DBConnector;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("devDb")
public class DevDBConnector implements DBConnector {

    @Override
    public void configure() {
        System.out.println("devdb");

    }
}
