package com.jose2401.test.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.jose2401.test.test.services.OrderService;
import com.jose2401.test.test.services.ProductService;

@SpringBootTest
@ActiveProfiles("test")
@RunWith(MockitoJUnitRunner.class)
public class MockitoDemoApplicationTests {
	
	@InjectMocks
	OrderService orderService;
	
	@Mock
	ProductService productService;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testOK() {
		Mockito.when(productService.getName()).thenReturn("Mock Product Name");
		String testName = orderService.getProductName();
		Assert.assertEquals("Mock Product Name", testName);
	}
	
	@Test
	public void testNOK() {
		Mockito.when(productService.getName()).thenReturn("Mock Product Name");
		String testName = orderService.getProductName();
		Assert.assertEquals("Mock Order Name", testName);
	}
}