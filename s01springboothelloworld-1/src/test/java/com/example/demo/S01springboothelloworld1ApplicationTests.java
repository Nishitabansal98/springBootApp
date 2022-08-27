package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;

@SpringBootTest
class S01springboothelloworld1ApplicationTests {
	
	@Autowired
	ApplicationContext context;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	void saveProduct(){
	ProductRepository repo = context.getBean(ProductRepository.class);
	
	Product product = new Product();
	product.setId(8);
	product.setName("Headset");
	product.setDescription("Bluetooth");
	product.setPrice("2000");
	repo.save(product);
	}
}
