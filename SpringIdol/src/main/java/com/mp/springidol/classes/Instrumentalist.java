package com.mp.springidol.classes;

import org.apache.log4j.Logger;

import com.mp.springidol.interfaces.Instrument;
import com.mp.springidol.interfaces.Performer;

public class Instrumentalist implements Performer {
	static final Logger LOGGER = Logger.getLogger(Instrumentalist.class);
	private String song;
	private Instrument instrument;

	public void perform() throws PerformanceException {
		LOGGER.info("Instrumentalist.perform(): Instrument - " + instrument);
		System.out.println("GRAM " + song + " : ");
		instrument.play();
	}

	public String screamSong() {
		return song;
	}

	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}
}
