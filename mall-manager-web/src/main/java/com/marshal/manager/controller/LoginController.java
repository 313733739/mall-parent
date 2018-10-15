package com.marshal.manager.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/login")
public class LoginController {

    @RequestMapping("/name")
    public Map name(){
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        Map<String,String> map=new HashMap<String,String>();
        map.put("userName",username);
        return map;
    }
}
