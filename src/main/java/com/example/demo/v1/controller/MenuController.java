package com.example.demo.v1.controller;

import com.example.demo.v1.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;

@Controller
public class MenuController {

    @Autowired
    MenuService menuService;

    @GetMapping("menu")
    public String doMenu(Model model){

        // Data 만들기, List, Map
        List<Map<String, Object>> list = menuService.doList();

        // Data 송부
        model.addAttribute("list",list);

        return "/v1/menu/menu";
    }
}
