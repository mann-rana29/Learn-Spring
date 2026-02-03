package main.ch10.controllers;

import main.ch10.NotEnoughMoneyException;
import main.ch10.models.ErrorDetails;
import main.ch10.models.PaymentDetails;
import main.ch10.services.PaymentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@RestController
public class PaymentController {
    private static Logger logger = Logger.getLogger(PaymentController.class.getName());
    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    @PostMapping("/payment")
    public ResponseEntity<PaymentDetails> makePayment(
            @RequestBody PaymentDetails paymentDetails
    ){
            logger.info("Received Payment " + paymentDetails.getAmount());

            return ResponseEntity.accepted().body(paymentDetails);
    }
}
