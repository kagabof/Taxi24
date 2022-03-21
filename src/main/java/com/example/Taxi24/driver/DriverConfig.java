package com.example.Taxi24.driver;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DriverConfig {
    @Bean
    CommandLineRunner commandLineRunner(DriverRepository repository) {
        return args -> {
            Driver mariam = new Driver("mariam", "mariam", "+22222", 20, 30);
            Driver dev = new Driver("dev", "dev", "+22222", 20, 30);
            Driver alex = new Driver("alex", "alex", "+22222", 20, 30);

            repository.saveAll(
                    List.of(mariam, alex)
            );
        };
    };
}
