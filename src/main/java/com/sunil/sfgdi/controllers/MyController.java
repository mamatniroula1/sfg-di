package com.sunil.sfgdi.controllers;

import com.sunil.sfgdi.service.AddTwoNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {


    public String sayHello(){
        System.out.println(" Hello World");
        return "Hi folks";
    }
}
