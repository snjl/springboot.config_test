package com.example.myproject.web;
import com.example.myproject.domain.DBConnector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    DBConnector connector ;

    @RequestMapping(value = {"/",""})
    public String hellTask(){

        connector.configure(); //最终打印testdb     
        return "hello task !! myage is " + 22;
    }
}