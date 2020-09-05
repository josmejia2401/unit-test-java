package com.jose2401.test.test;

import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import com.jose2401.test.test.services.ProductService;

@Profile("test")
@Configuration
public class ProductServiceTestConfiguration {
	@Bean
	@Primary
	public ProductService productService() {
		return Mockito.mock(ProductService.class);
	}
}