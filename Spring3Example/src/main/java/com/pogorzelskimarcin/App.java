/**
 * http://www.mkyong.com/spring3/spring-3-javaconfig-example/
 * */
package com.pogorzelskimarcin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	private static ApplicationContext ctx;

	public static void main(String[] args) {
		ctx = new ClassPathXmlApplicationContext("SpringBeans.xml");
		HelloBean bean = (HelloBean) ctx.getBean("helloBean");
		bean.printHello();

	}

}
