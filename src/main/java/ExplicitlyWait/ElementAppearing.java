package ExplicitlyWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementAppearing {

	public static void main(String[] args) {
		// load the browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		// load url
		driver.get("http://www.leafground.com/pages/appear.html");
		driver.manage().window().maximize();
		
		//locate the element which is appearing after few seconds
		WebElement findElement = driver.findElement(By.xpath("//button[@id='btn']/b"));
		//add webdriver wait
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		//give condition 
		//wait.until(ExpectedConditions.visibilityOf(findElement));
		//now get the text from the above element
		String text = findElement.getText();
		//verify that after few second the element appeared on the webpage
		if (text.equals("Voila! I'm here Guys")) {
			System.out.println(text+" : appeared after some seconds");
		} else {
			System.out.println(text+" : not appeared after some seconds");

		}
		//lets see what happened without webdriver wait
		//the text cannot be verified
		
		
	
		
		
	}

}
