package com.mp.classes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mp.interfaces.CustomerDAO;

public class AppClass {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Spring.xml");
		CustomerDAO customerDAO = (CustomerDAO)ctx.getBean("customerDAO");
		Customer customer = new Customer(1, "MP", 33);
		customerDAO.insert(customer);
		
		Customer customer2 = customerDAO.findByCustomerId(1);
		System.out.println(customer2);

	}

}
