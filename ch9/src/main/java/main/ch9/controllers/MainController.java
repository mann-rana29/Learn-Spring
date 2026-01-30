package main.ch9.controllers;

import main.ch9.services.LoggedUserManagementService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    private final LoggedUserManagementService loggedUserManagementService;

    public MainController(LoggedUserManagementService loggedUserManagementService){
        this.loggedUserManagementService = loggedUserManagementService;
    }

//    @GetMapping("/main")
//    public String home(){
//        String username = loggedUserManagementService.getUsername();
//
//        if(username == null){
//            return "redirect:/";
//        }
//        return "main.html";
//    }

    @GetMapping("/main")
    public String home(@RequestParam(required = false) String logout , Model model){
        if(logout != null){
            loggedUserManagementService.setUsername(null);
        }

        String username = loggedUserManagementService.getUsername();

        if(username == null){
            return "redirect:/";
        }

        return "main.html";
    }
}
