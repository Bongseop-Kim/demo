package com.example.demo.v1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {

    @GetMapping("member")
    public String doMember(){
        return "/v1/member/member";
    }
}
