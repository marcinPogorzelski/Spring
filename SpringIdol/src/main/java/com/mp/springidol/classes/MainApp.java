package com.mp.springidol.classes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mp.springidol.interfaces.Performer;

public class MainApp {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
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
		
		Performer performer3 = (Performer)context.getBean("tom");
		try {
			performer3.perform();
		} catch (PerformanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Performer performer4 = (Performer)context.getBean("hank");
		try {
			performer4.perform();
		} catch (PerformanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
