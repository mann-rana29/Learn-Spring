package main.ch9.controllers;

import main.ch9.services.LoginProcesser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/")
    public String getLogin(){
        return "login.html";
    }

    @PostMapping("/")
    public String loginPost(@RequestParam String username, @RequestParam String password , Model model){
        LoginProcesser lp = new LoginProcesser();
        lp.setPassword(password);
        lp.setUsername(username);

        boolean loggedIn = lp.login();

        if(loggedIn){
            model.addAttribute("message","You are logged in");
        }else{
            model.addAttribute("message","Wrong credentials");
        }

        return "login.html";
    }
}
