package com.mp.junitsample.tests;

import org.junit.Assert;
import org.junit.Test;

import com.mp.junitsample.classes.CalcClass;


public class CalcClassTest {
	CalcClass myClass = new CalcClass();
	
@Test
public void checkAddTest(){

Assert.assertEquals("1+2 powinno byc rowne 3",3, myClass.addMethod(1, 2));
}

@Test
public void checkMultiplyTest(){
	Assert.assertEquals(6, myClass.multiplyMethod(2, 3));
}
}
