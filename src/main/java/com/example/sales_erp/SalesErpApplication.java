package com.example.sales_erp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication(scanBasePackages={"com.speedment.jpastreamer"})
public class SalesErpApplication {

	public static void main(String[] args) {
		SpringApplication.run(SalesErpApplication.class, args);
	}

}
