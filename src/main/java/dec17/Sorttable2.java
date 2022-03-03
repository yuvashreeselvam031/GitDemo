package dec17;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sorttable2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/sorttable.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		List<WebElement> findElements = driver.findElements(By.xpath("//table[@id='table_id']//td[2]"));
		List<String> names1 = new ArrayList<String>();
		for (int i = 0; i < findElements.size(); i++) {
			names1.add(findElements.get(i).getText());
		}
		Collections.sort(names1);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//th[text()='Name']")).click();
		List<String> names2 = new ArrayList<String>();
		List<WebElement> findElements2 = driver.findElements(By.xpath("//table[@id='table_id']//td[2]"));
		for (int i = 0; i < findElements.size(); i++) {
			names2.add(findElements2.get(i).getText());	
		}
		if (names1.equals(names2)) {
			System.out.println("passed");
		} else {
			System.out.println("failed");
		}
		
		
	}

}
