package main.ch10.controllers;

import main.ch10.NotEnoughMoneyException;
import main.ch10.models.ErrorDetails;
import main.ch10.models.PaymentDetails;
import main.ch10.services.PaymentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    @PostMapping("/payment")
    public ResponseEntity<PaymentDetails> makePayment(){
            PaymentDetails paymentDetails = paymentService.processPayment();
            return ResponseEntity.accepted().body(paymentDetails);
    }
}
