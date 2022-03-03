package dec17;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitToDisappear {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/disapper.html");
		driver.manage().window().maximize();
		WebElement findElement = driver.findElement(By.xpath("//button[@id='btn']/b"));
		String text = findElement.getText();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.invisibilityOf(findElement));
		if (findElement.getText().contains(text)) {
			System.out.println("failed");
		}
		else {
			System.out.println("success");
		}
		
		
	}

}
