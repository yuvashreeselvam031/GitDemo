package dec17;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(); 	
		driver.get("http://leafground.com/pages/Edit.html");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("earth@gmail.com");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("edit",Keys.TAB);
		String attribute = driver.findElement(By.xpath("//label[@for='uname']/following::input")).getAttribute("value");
		System.out.println(attribute);
		driver.findElement(By.xpath("(//input[@name='username'])[2]")).clear();
		boolean enabled = driver.findElement( By.xpath("//label[@for='disabled']/following::input")).isEnabled();
		System.out.println(enabled);
	}

}
