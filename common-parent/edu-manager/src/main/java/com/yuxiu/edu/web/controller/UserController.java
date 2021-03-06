package com.yuxiu.edu.web.controller;

import com.yuxiu.edu.model.User;
import com.yuxiu.edu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("login")
    public String login(){
        System.out.println(".！！！..Default");
        return "Default";
    }

    @RequestMapping("find")
    public String find(Integer id){
        System.out.println("....发现页面.");
        User user = userService.findById(id);
        System.out.println(user);
        return null;
    }

    @RequestMapping("manage")
    public String manage(){
        System.out.println(".....管理页面");
        return "user/manage";
    }

    @RequestMapping("info")
    public String info(){
        System.out.println(".....详情页面");
        return "user/info";
    }

    @RequestMapping("edit")
    public String edit(){
        System.out.println(".....修改页面");
        return "user/edit";
    }
}
