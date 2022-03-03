package dec17;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolTip {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
			
		driver.get("http://www.leafground.com/pages/tooltip.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		String attribute = driver.findElement(By.xpath("//input[@id='age']")).getAttribute("title");
		if (attribute.equalsIgnoreCase	("enter your name")) {
			System.out.println("success");
		} else {
			System.out.println("failure");

		}
		
	}

}
