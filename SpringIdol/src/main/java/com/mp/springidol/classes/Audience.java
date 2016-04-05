package com.mp.springidol.classes;


import org.aspectj.lang.ProceedingJoinPoint;

public class Audience {

	public void takeSeats() {
		System.out.println("Widzowie zajmuj� miejsca. ");
	}

	public void turnOffCellPhones() {
		System.out.println("Widzowie wy��czaj� telefony kom�rkowe. ");
	}

	public void makeApplaud() {
		System.out.println("Brawoooo!");
	}

	public void demandRefund() {
		System.out.println("S�aby wyst�p..");
	}

	public void watchPerformance(ProceedingJoinPoint joinPoint) {
		try {
			System.out.println("watchPerformance: Widzowie zajmuja miejsca...");
			System.out.println("watchPerformance: Widzowie wy��czaj� telefony...");
			long start = System.currentTimeMillis();

			joinPoint.proceed();

			long end = System.currentTimeMillis();
			System.out.println("watchPerformance: Oklaski!");
			System.out.println("Wyst�p trwa� " + (end - start) + " milisekund");
		} catch (Throwable e) {
			System.out.println("Nieudany wyst�p");
		}
	}

}
