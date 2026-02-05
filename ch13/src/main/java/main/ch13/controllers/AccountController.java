package main.ch13.controllers;

import main.ch13.models.Account;
import main.ch13.models.TransferRequest;
import main.ch13.services.TransferService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountController {
    private final TransferService transferService;

    public AccountController(TransferService transferService){
        this.transferService = transferService;
    }

    @PostMapping("/transfer")
    public void sendMoney(@RequestBody TransferRequest transferRequest){
        transferService.transferMoney(transferRequest.getSenderAccountId(),transferRequest.getReceiverAccountId(), transferRequest.getAmount());
    }

    @GetMapping("/accounts")
    public List<Account> getAllAccounts(){
        return transferService.getAllAccounts();
    }
}
