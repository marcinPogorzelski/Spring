package com.mp.springidol.classes;

import com.mp.springidol.interfaces.Poem;

public class LoremIpsumPoem implements Poem {
	private static String[] Lines = { "Lorem ipsum dolor sit amet, ", "consectetur adipiscing elit. ",
			"Curabitur venenatis cursus pulvinar. ", "Quisque eu hendrerit nunc, ", "sit amet iaculis diam. ",
			"Duis convallis, tellus eget ullamcorper vulputate, " };

	public LoremIpsumPoem() {
	}

	public void recite() {
		for (int i = 0; i < Lines.length; i++) {
			System.out.println(Lines[i]);
		}

	}

}
