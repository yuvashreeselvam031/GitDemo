package dec17;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitToAppears {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(); 	
		driver.get("http://www.leafground.com/pages/appear.html");
		WebElement findElement = driver.findElement(By.xpath("//button[@id='btn']/b"));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(findElement));
		String text = findElement.getText();
		if (findElement.getText().contains(text)) {
			System.out.println(text+" element appeared");
		} else {
			System.out.println(text+" element not appeared");

		}
		
	}

}
