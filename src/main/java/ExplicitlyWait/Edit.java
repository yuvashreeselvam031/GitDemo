package ExplicitlyWait;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit {

	public static void main(String[] args) {

		// load the browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		// load url
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();	
		// enter the email id 
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("earth@gmail.com");
		//Append a text and press keyboard tab
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Edit",Keys.TAB);
		//Get default text entered
		//use getAttribute to get the default text
		String attribute = driver.findElement(By.xpath("(//input[@type='text'])[3]")).getAttribute("value");
		System.out.println(attribute);
		//Clear the text
		driver.findElement(By.xpath("(//input[@name='username'])[2]")).clear();
		//Confirm that edit field is disabled
		//use isenabled method to confirm the field is disabled
		boolean enabled = driver.findElement(By.xpath("(//input[@type='text'])[5]")).isEnabled();
		if (enabled) {
			System.out.println("field enabled");
		} else {
			System.out.println("field disabled");

		}

	}

}
