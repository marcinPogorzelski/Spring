package com.mp.hibernate;

public class MainApp {

	public static void main(String[] args) {
		HbGuest guest = new HbGuest();
		guest.setAddress("Adres test");
		guest.setName("hbGuest");
		guest.setAge(13);
		
		HbUtils.createGuest(guest);

	}

}
