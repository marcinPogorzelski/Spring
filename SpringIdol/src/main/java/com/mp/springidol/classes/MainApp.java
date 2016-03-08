package com.mp.springidol.classes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mp.springidol.interfaces.Performer;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		Performer performer = (Performer)context.getBean("duke");
		try {
			performer.perform();
		} catch (PerformanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Performer performer2 = (Performer)context.getBean("kenny");
		try {
			performer2.perform();
		} catch (PerformanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
