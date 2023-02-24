package com.li.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;


//在templates目录下的所有页面，只能通过controller来跳转
//这个需要模板引擎的支持，thymeleaf
@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("msg","厉害厉害你坤哥");
        model.addAttribute("users", Arrays.asList("基尼太美","你干嘛哎呦","一个真正的man"));
        return "index";
    }
}
