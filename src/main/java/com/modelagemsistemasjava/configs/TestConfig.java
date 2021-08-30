package com.modelagemsistemasjava.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.modelagemsistemasjava.services.DBService;
import com.modelagemsistemasjava.services.EmailService;
import com.modelagemsistemasjava.services.MockEmailService;
import com.sun.el.parser.ParseException;

@Configuration
@Profile("test")
public class TestConfig {

	@Autowired
	private DBService dbService;

	@Bean
	public boolean instantiateDatabase() throws ParseException, java.text.ParseException {
		dbService.instantiateTestDatabase();
		return true;
	}

	@Bean
	public EmailService emailService() {
		return new MockEmailService();
	}

}