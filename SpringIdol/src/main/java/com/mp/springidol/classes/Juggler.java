package com.mp.springidol.classes;

import org.apache.log4j.Logger;

import com.mp.springidol.interfaces.Performer;

public class Juggler implements Performer {
	private int beanBags = 3;
	
	static final Logger LOGGER = Logger.getLogger(Juggler.class);

	public Juggler() {
	}

	public Juggler(int beanBags) {
		this.beanBags = beanBags;
	}

	public void perform() throws PerformanceException {
		LOGGER.info("Juggler.perform(): beanBags - " + beanBags);
		System.out.println("¯ONGLUJÊ " + beanBags + " WORECZKAMI Z GROCHEM");
	}

}
