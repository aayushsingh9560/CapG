package com.pkart.dao;

import com.pkart.model.Customer;

public interface ICustomerDao {

	void register(Customer customer);
	
	void update(Customer customer);
	
	Customer viewProfile(int custId);
	
	
}
