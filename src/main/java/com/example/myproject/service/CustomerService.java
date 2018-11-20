package com.example.myproject.service;

import com.example.myproject.domain.Customer;
import com.example.myproject.domain.Customer2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private Customer customer;

    @Autowired
    private Customer2 customer2;

    public void printCustomer() {
        System.out.println(customer.getName());
    }

    public Customer getCustomer(){
        return customer;
    }

    public Customer2 getCustomer2(){
        return customer2;
    }
}
