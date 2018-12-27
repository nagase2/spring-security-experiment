package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MyController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name,
            Model model) {
        System.out.println("greeting has been called!!!!");
        model.addAttribute("name", name);
        return "greeting";
    }
    
    @GetMapping("/greeting2")
    @ResponseBody
    public String greeting2(@RequestParam(name = "name", required = false, defaultValue = "World") String name,
            Model model) {
        System.out.println("greeting2 has been called!!!!");
        return "greeting2";
    }
}