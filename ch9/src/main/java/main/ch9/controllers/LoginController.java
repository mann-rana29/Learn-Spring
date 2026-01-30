package main.ch9.controllers;

import main.ch9.services.LoginProcesser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    LoginProcesser loginProcesser;

    public LoginController(LoginProcesser loginProcesser){
        this.loginProcesser = loginProcesser;
    }

    @GetMapping("/")
    public String getLogin(){
        return "login.html";
    }

    @PostMapping("/")
    public String loginPost(@RequestParam String username, @RequestParam String password , Model model){

        loginProcesser.setUsername(username);
        loginProcesser.setPassword(password);
        boolean loggedIn = loginProcesser.login();

        if(loggedIn){
            return "redirect:/main";
        }
        model.addAttribute("message","Login failed!");

        return "login.html";
    }
}
