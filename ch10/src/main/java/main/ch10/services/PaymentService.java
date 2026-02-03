package main.ch10.services;

import main.ch10.NotEnoughMoneyException;
import main.ch10.models.PaymentDetails;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public PaymentDetails processPayment(){
        throw new NotEnoughMoneyException();
    }
}
