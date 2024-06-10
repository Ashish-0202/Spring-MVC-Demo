package com.demomvc.SpringMVCdemo.Controller;

import com.demomvc.SpringMVCdemo.Model.Users;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class LoginController {

    @Value("${Gender}")
    public List<String> gender;

    @Value("${Languages}")
    public List<String> languages;

    @Value("${Systems}")
    private List<String> systems;

    @PostMapping("/login")
    public String login(@ModelAttribute("login")Users users){
        System.out.println("Username: "+users.getUsername()+ "- Password: "+users.getPassword());
        return "userhome";
    }

    @GetMapping("/register")
    public String register(Model model){
        Users users=new Users();
        model.addAttribute("users",users);
        model.addAttribute("languages",languages);
        model.addAttribute("gender",gender);
        model.addAttribute("Systems",systems);
        return "register";
    }

    @PostMapping("/registerUser")
    public String registerUser(@ModelAttribute("users") Users users){
        System.out.println("Username: "+users.getUsername()+"\n Password: "+users.getPassword()+"\n Email: "+users.getEmail()+"\n Gender: "+users.getGender()+"\n Language: "+users.getLanguage());
        return "userRegisterhome";
    }
}
