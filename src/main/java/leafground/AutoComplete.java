package leafground;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoComplete {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/autoComplete.html");
		driver.findElement(By.xpath("//input[@id='tags']")).sendKeys("appi");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='tags']")).sendKeys(Keys.DOWN,Keys.ENTER);
		

		
		
	}

}
