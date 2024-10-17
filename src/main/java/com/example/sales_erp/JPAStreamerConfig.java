package com.example.sales_erp;

import com.speedment.jpastreamer.application.JPAStreamer;
import jakarta.persistence.EntityManagerFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@RequiredArgsConstructor
@Configuration
public class JPAStreamerConfig {
    private final EntityManagerFactory entityManagerFactory;

    @Bean
    public JPAStreamer jpaStreamer(){
        return JPAStreamer.of(entityManagerFactory);
    }
}
