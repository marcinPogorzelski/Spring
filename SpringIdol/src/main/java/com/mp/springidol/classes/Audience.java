package com.mp.springidol.classes;


import org.aspectj.lang.ProceedingJoinPoint;

public class Audience {

	public void takeSeats() {
		System.out.println("Widzowie zajmuj¹ miejsca. ");
	}

	public void turnOffCellPhones() {
		System.out.println("Widzowie wy³¹czaj¹ telefony komórkowe. ");
	}

	public void makeApplaud() {
		System.out.println("Brawoooo!");
	}

	public void demandRefund() {
		System.out.println("S³aby wystêp..");
	}

	public void watchPerformance(ProceedingJoinPoint joinPoint) {
		try {
			System.out.println("watchPerformance: Widzowie zajmuja miejsca...");
			System.out.println("watchPerformance: Widzowie wy³¹czaj¹ telefony...");
			long start = System.currentTimeMillis();

			joinPoint.proceed();

			long end = System.currentTimeMillis();
			System.out.println("watchPerformance: Oklaski!");
			System.out.println("Wystêp trwa³ " + (end - start) + " milisekund");
		} catch (Throwable e) {
			System.out.println("Nieudany wystêp");
		}
	}

}
