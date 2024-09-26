package com.ahmed.user;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Bean
	public OpenAPI openAPI() {
		return new OpenAPI()
				.info(new Info()
						.title("Spring Boot REST API")
						.description("Spring Boot API Documentation")
						.contact(new Contact()
								.name("AHMED")
								.email("ahmed@example.com")) // İsteğe bağlı e-posta ekleyebilirsiniz
						.version("1.0")); // Sürüm numarasını daha iyi bir formatta belirtin
	}

}
