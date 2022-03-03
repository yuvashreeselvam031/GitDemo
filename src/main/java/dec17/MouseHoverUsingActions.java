package dec17;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHoverUsingActions {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/mouseOver.html");
		WebElement findElement = driver.findElement(By.linkText("TestLeaf Courses"));
		for (int i = 1; i < 3; i++) {
			String text = driver.findElement(By.xpath("(//a[text()='TestLeaf Courses']/following::li/a)["+i+"]")).getText();
			System.out.println(text);
		}
		
				
		Actions builder = new Actions(driver);
		builder.moveToElement(findElement).perform();
		
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().accept();
		
		
		
		
	}

}
