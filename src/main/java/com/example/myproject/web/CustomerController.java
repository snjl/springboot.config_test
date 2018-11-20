package com.example.myproject.web;

import com.example.myproject.domain.Customer;
import com.example.myproject.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 34924
 */
@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @RequestMapping("/customer")
    public String customer(ModelMap map) {
        Customer customer = customerService.getCustomer();
        map.addAttribute("customer", customer);
        return "index";
    }

}
