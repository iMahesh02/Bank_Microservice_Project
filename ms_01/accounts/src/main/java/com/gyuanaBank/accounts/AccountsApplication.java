package com.gyuanaBank.accounts;

import com.gyuanaBank.accounts.dto.AccountsContactInfoDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(value = {AccountsContactInfoDto.class})
@OpenAPIDefinition(
		info = @Info(
				title = "Accounts Microservice REST API Documentation",
				description = "Bank of Guyana Accounts Microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Mahesh Warghane",
						email = "maheshwarghane147@gmail.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.google.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Bank of Guyana Accounts Microservice REST API Documentation",
				url = "https://www.spring.io"
		)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
