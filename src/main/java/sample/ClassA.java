package sample;

import org.testng.annotations.BeforeMethod;

public class ClassA {
	
	@BeforeMethod
	public void methodBase() {
		
		System.out.println("Method Base");

	}

}
