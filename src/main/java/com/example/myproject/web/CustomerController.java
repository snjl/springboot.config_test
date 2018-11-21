package com.example.myproject.web;

import com.example.myproject.domain.Customer;
import com.example.myproject.domain.Customer2;
import com.example.myproject.domain.Range;
import com.example.myproject.service.CustomerService;
import com.example.myproject.service.RangeService;
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
    private CustomerService customerService;

    @Autowired
    private RangeService rangeService;




    @RequestMapping("/customer")
    public String customer(ModelMap map) {
//        Customer customer = customerService.getCustomer();
        Customer2 customer = customerService.getCustomer2();
        map.addAttribute("customer", customer);
        return "index";
    }

    @RequestMapping("/range")
    public String range(ModelMap map) {
        Range range = rangeService.getRange();
        map.addAttribute("range", range);
        return "range";
    }
}
