package com.mp.interfaces;

import com.mp.classes.Customer;

public interface CustomerDAO {
	
	public void insert(Customer customer);
	public Customer findByCustomerId(int id);

}
