package com.Assertions.TestAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class AssertionDemo {
SoftAssert softass=new SoftAssert();
	
	@Test
	public void testDemo() {

		System.out.println("Userlogin Username");
		System.out.println("Userlogin Password");
		Assert.assertEquals(true, true);
		System.out.println("User in HomePage");
		System.out.println("User is clicked on Company LOGO");
		
		softass.assertEquals(true, false,"Not able to click Company LOGO");
		System.out.println("User is clicked on Help Link");
		System.out.println("User is clicked on Mail Us Link");
		
		softass.assertEquals(true, false,"Not able to click LogOut Link");
		
		System.out.println("User is clicked on Logout Link");
		softass.assertAll(); // It is mandotory if our TC is should fail msg in the output and it will run all tc  if any fail Tc  too
	}
}
