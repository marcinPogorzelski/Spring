package com.mp.classes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mp.interfaces.IKnight;

public class MainClass {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("Spring.xml");
		IKnight knight = (IKnight) context.getBean("knight");
		knight.embarkOnQuest();
	}

}
