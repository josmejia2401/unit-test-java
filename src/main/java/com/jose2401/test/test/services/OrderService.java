package com.jose2401.test.test.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

	@Autowired
	ProductService productService;

	public String getName() {
		return "OrderService";
	}

	public String getProductName() {
		return this.productService.getName();
	}
}
