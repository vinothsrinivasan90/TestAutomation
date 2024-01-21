package week5.day2;

import org.testng.annotations.Test;

public class testngAttributeslearn {

@Test(dependsOnMethods ="week5.day1.EditLead.editLead" )
public void method1() {
	
	System.out.println("method 1 passed");
	
	
}
	
	
	
}
