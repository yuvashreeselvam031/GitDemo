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

public class SortTable {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/sorttable.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		List<String> list = new ArrayList<String>();
		for (int i = 1; i < args.length; i++) {
			 String text = driver.findElement(By.xpath("(//table[@id='table_id']//td[2])["+i+"]")).getText();
			 list.add(text);
			 
		}
		
		Collections.sort(list);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//th[text()='Name']")).click();
		List<String> list2 = new ArrayList<String>();
		for (int i = 1; i < args.length; i++) {
			 String text = driver.findElement(By.xpath("(//table[@id='table_id']//td[2])["+i+"]")).getText();
			 list2.add(text);
			 
			 
		}
		if (list.equals(list2)) {
			System.out.println("success");
		} else {
			System.out.println("failure");

		}
	}

}
