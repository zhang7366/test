package com.example.test.controller;

import com.example.test.bean.UserBean;
import com.example.test.service.UserService;
import com.example.test.vo.ResultInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class LoginController {
    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public String show(){
        return "login";
    }

    @RequestMapping(value = "/loginIn",method = RequestMethod.POST)
    public String login(String name,String password){
        ResultInfo resultInfo = userService.loginIn(name, password);
        if(resultInfo.getCode()==1){
            return "success";
        }else {
            return "error";
        }
    }

}
