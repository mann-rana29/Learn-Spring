package main.ch11service2.proxies;

import main.ch11service2.models.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "payments", url = "${name.service.url}")
public interface PaymentsProxy {

    @PostMapping("/payment")
    public Payment createPayment(@RequestHeader String requestId , @RequestBody Payment payment );
}
