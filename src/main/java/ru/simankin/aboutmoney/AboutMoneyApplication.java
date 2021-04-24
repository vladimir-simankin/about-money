package ru.simankin.aboutmoney;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class AboutMoneyApplication {

    public static void main(String[] args) {
        SpringApplication.run(AboutMoneyApplication.class, args);
    }
}
