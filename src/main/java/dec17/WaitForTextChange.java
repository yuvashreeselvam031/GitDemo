package dec17;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForTextChange {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(); 	
		driver.get("http://www.leafground.com/pages/TextChange.html");
		WebElement findElement = driver.findElement(By.xpath("//button[@id='btn']"));
		String text = findElement.getText();
		
		/*
		 * WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		 * wait.until(ExpectedConditions.(findElement));
		 */
		Thread.sleep(5000);
		String text2 = findElement.getText();
		if (!text.equals(text2)) {
			findElement.click();
			String text3 = driver.switchTo().alert().getText();
			
			driver.switchTo().alert().accept();
			System.out.println(text3);
		} 
		
		
		
	}

}
