package com.example.demo.v1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OrderController {
    @GetMapping("order")
    public String doOrder(){
        return "/v1/order/order";
    }
}
