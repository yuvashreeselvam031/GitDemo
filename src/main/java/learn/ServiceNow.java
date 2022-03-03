package learn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceNow {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://dev81721.service-now.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='gsft_main']"));		
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//label[text()='User name']/following::input")).sendKeys("admin");
		driver.findElement(By.xpath("//label[text()='Password']/following::input")).sendKeys("HopeAngel$99");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		

	}

}
