package com.mp.springidol.classes;

import java.util.Map;

import org.apache.log4j.Logger;

import com.mp.springidol.interfaces.Instrument;
import com.mp.springidol.interfaces.Performer;

public class OneManBand implements Performer {
	static final Logger LOGGER = Logger.getLogger(OneManBand.class);
	private Map<String,Instrument> instruments;

	public void setInstruments(Map<String, Instrument> instruments) {
		this.instruments = instruments;
	}

	public void perform() throws PerformanceException {
		for (String key : instruments.keySet()) {
			LOGGER.info("OneManBand.perform(): Instrument - " + Instrument.class);
			System.out.println(key + " : ");
			Instrument instrument = instruments.get(key);
			instrument.play();
		}

	}

}
