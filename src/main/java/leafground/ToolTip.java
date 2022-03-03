package leafground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolTip {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/tooltip.html");
		WebElement findElement = driver.findElement(By.xpath("//input[@id='age']"));
		Actions builder  = new Actions(driver);
       
		String attribute = findElement.getAttribute("title");
		System.out.println(attribute);
		 builder.moveToElement(findElement).click().perform();
		
	}

}
