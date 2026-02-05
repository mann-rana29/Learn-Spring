package main.ch13.services;

import main.ch13.models.Account;
import main.ch13.repositories.AccountRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Service
public class TransferService {
     public final AccountRepository accountRepository;

     public TransferService(AccountRepository accountRepository){
         this.accountRepository = accountRepository;
     }

     @Transactional
     public void transferMoney(long senderId , long receiverId, BigDecimal amount){
        Account sender =  accountRepository.findAccountById(senderId);
        Account receiver = accountRepository.findAccountById(receiverId);

        BigDecimal senderBalance = sender.getAmount();
        BigDecimal receiverBalance = receiver.getAmount();

        BigDecimal newSenderBalance = senderBalance.subtract(amount);
        BigDecimal newReceiverBalance = receiverBalance.add(amount);

        accountRepository.changeAmount(senderId,newSenderBalance);
        accountRepository.changeAmount(receiverId,newReceiverBalance);
     }

     public List<Account> getAllAccounts(){
         return accountRepository.findAllAccounts();
     }


}

