package com.pkart.service;

import java.util.List;

import com.pkart.model.Product;

public interface ICustomerService {

	boolean ;

	void update(Product product);

	Product getProduct(int productId);

	List<Product> getAllProducts();
}
