package ExplicitlyWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementDisappearance {

	public static void main(String[] args) {
		//load the browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		//load url
		driver.get("http://www.leafground.com/pages/disapper.html");
		driver.manage().window().maximize();
		//locate the disappearing element by pausing it
		//give ctrl+2+l
		WebElement findElement = driver.findElement(By.xpath("//button[@id='btn']/b"));
		//add webdriver wait
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.invisibilityOf(findElement));
		String text = driver.findElement(By.xpath("//div[@class='disappear']//strong")).getText();
		//after findElement disappeared new text is appearing verify that text
		if (text.contains("I know you can do it! Button is disappeared!")) {
			System.out.println(text+" is appeared after applying webdriver wait");
		} else {
			System.out.println(text+" is not appeared after applying webdriver wait");

		}
		
		
		
	}

}
