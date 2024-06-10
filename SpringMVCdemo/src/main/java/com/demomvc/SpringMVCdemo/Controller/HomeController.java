package com.demomvc.SpringMVCdemo.Controller;

import com.demomvc.SpringMVCdemo.Model.Users;
import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Locale;

@Controller
@RequestMapping("/api")
public class HomeController {
    @GetMapping("/home")
    public String homepage(){
        return "Home";
    }

    @PostMapping("/processform")
    public String processform(@RequestParam("thename") String name, Model model){

        String thename= name.toLowerCase(Locale.ROOT);

        model.addAttribute("result",thename);

        return "display";

    }
    @GetMapping("/login")
    public String loginform(Model model){
        Users users=new Users();

        model.addAttribute("login",users);
        return "login";
    }

}
