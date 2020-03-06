package com.uabc.edu.arquitectura.ejemploarquitectura;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EnableJpaRepositories("com.uabc.edu.arquitectura.ejemploarquitectura.repository")
public class EjemploarquitecturaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EjemploarquitecturaApplication.class, args);
    }

}
