package org.example.th_spring_greeting;

import jdk.internal.classfile.impl.BufferedMethodBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String getHome(@RequestParam String name, Model model){
        model.addAttribute("name",name);
        return "/home";
    }
}
