package com.mp.springidol.classes;

import com.mp.springidol.interfaces.MindReader;

public class Magician implements MindReader {
	private String thoughts;

	@Override
	public void interceptThoughts(String thoughts) {
		System.out.println("Przechwytujê myœli ochotnika: ");
		this.thoughts = thoughts;
	}

	@Override
	public String getThoughts() {
		return thoughts;
	}

}
