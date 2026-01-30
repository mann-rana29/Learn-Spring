package main.ch9.services;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@RequestScope
@Component
public class LoginProcesser {
    private String username;
    private String password;
    private final LoggedUserManagementService loggedUserManagementService;


    public LoginProcesser(LoggedUserManagementService loggedUserManagementService){
        this.loggedUserManagementService = loggedUserManagementService;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean login(){
        String username = this.getUsername();
        String password = this.getPassword();
        if(username.equals("mann") && password.equals("rana")){
            loggedUserManagementService.setUsername(username);
            return true;
        }
        else{
            return false;
        }
    }
}
