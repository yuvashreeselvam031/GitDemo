package sample;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassB {
	
	//@BeforeMethod
	public void methodBase() {
		System.out.println("mthd check");

	}
	@Test
	public void testMthod() {
		
		System.out.println("test");
		System.setProperty("Webdriver.chrome.driver", "./SeleniumJava/drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		/*
		 * WebDriverManager.edgedriver().setup(); EdgeDriver driver = new EdgeDriver();
		 */
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
	}
	
	

}
