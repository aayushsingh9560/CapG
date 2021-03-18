package com.pkart.dao;

import java.util.HashMap;
import java.util.Map;

import com.pkart.model.Customer;
import com.pkart.model.Product;

public class CustomerDaoImp implements ICustomerDao{

	
	private static Map<Integer, Customer> customers = new HashMap<Integer, Customer>();

	public CustomerDaoImp() {

		if (null == customers) {
			
			
		}

	}
	
	
	@Override
	public void register(Customer customer) {
		
		customers.put(customer.getId(), customer);
	}

	@Override
	public void update(Customer customer) {
		
		customers.put(customer.getId(), customer);
	}

	@Override
	public Customer viewProfile(int custId) {
		
		return customers.get(new Integer(custId));
	}
	
}
