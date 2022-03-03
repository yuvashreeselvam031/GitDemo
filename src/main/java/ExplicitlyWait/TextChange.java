package ExplicitlyWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextChange {

	public static void main(String[] args) {
		// load the browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		// load url
		driver.get("http://www.leafground.com/pages/TextChange.html");
		driver.manage().window().maximize();
		//locate the element
		WebElement findElement = driver.findElement(By.xpath("//button[@class='btn']"));
		//add webdriver wait
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		//type the condition
		wait.until(ExpectedConditions.textToBePresentInElement(findElement, "Click ME!"));
		//click that element after the condition 
		findElement.click();
		//handle the alert and get that text
		String text = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		//print that text
		System.out.println(text);
		
		

	}

}
