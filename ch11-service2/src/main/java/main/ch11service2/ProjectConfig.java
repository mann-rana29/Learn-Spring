package main.ch11service2;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "main.ch11service2")
public class ProjectConfig {
}
