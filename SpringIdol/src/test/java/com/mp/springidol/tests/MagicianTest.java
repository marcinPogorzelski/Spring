package com.mp.springidol.tests;

import org.junit.Test;
import org.junit.Assert;

import com.mp.springidol.classes.Magician;
import com.mp.springidol.classes.Volunteer;

public class MagicianTest {
	Magician magician = new Magician();
	Volunteer volunteer = new Volunteer();
	
	@Test
	public void magicianShouldReadVolunteersMind(){
		volunteer.thinkOfSomething("some Mind");
		Assert.assertEquals("some Mind", magician.getThoughts());
	}

}
