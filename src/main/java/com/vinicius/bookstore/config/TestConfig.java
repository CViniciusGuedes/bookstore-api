package com.vinicius.bookstore.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.vinicius.bookstore.service.DBService;

import jakarta.annotation.PostConstruct;

@Configuration
@Profile("test")
public class TestConfig {
	
	@Autowired
	private DBService dbService;

	@PostConstruct
	public void instanciaBaseDeDados() {
		this.dbService.instanciaBaseDeDados();
	}

}
