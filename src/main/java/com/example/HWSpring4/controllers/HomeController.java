package com.example.HWSpring4.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @RequestMapping("/t1")
    public String showDefault(){
        return "homeW";
    }

    @GetMapping("/mes")
    public String pushMessage(@RequestParam(name = "sendler") String sendler, @RequestParam(name = "message") String message, Model model){
        model.addAttribute("sendler", sendler);
        model.addAttribute("message", message);

        return "messagePage";
    }

    @GetMapping("/mesFP")
    public String pushMessageFP(@RequestParam(name = "sendler") String sendler, @RequestParam(name = "message") String message, @RequestParam(name = "fontsize") int fontsize, Model model){
        model.addAttribute("sendler", sendler);
        model.addAttribute("message", message);
        model.addAttribute("fontsize", fontsize+"px");

        return "messagePageFP";
    }


}
