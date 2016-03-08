package com.mp.classes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mp.interfaces.IKnight;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("Spring.xml");
		IKnight knight = (IKnight) context.getBean("knight");
		knight.embarkOnQuest();

	}

}
