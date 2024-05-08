package info;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsExample {
	
	String str = "sanjay";
	@Test
	public void checkEual() {
		if(str.equals("sanjay")) {
			System.out.println("str is equal");
		}

			else{
				System.out.println("str is not  equal");
			}
			
		Assert.assertNotEquals(str, "sanjay");
	
	}

}
