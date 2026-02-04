package main.ch11service2;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
@EnableFeignClients(basePackages = "main.ch11service2")
public class ProjectConfig {
    @Bean
    public WebClient webClient(){
        return WebClient.builder().build();
    }
}
