package com.chenjiacheng.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by chenjiacheng on 2024/5/23 00:47
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
@Controller
public class EchoController {

    @GetMapping("/echo")
    public String echo(Model model, @RequestParam("msg")String msg){
        model.addAttribute("msg",msg);
        return "echo";
    }
}
