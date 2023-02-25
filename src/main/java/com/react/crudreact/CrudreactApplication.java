package com.react.crudreact;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition
public class CrudreactApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudreactApplication.class, args);
	}

}
