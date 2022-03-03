package ExplicitlyWait;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SortTable {

	public static void main(String[] args) throws InterruptedException {

		// load the browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		// load url
		driver.get("http://www.leafground.com/pages/sorttable.html");
		driver.manage().window().maximize();
		// inspect the names
		// locate the elements and store it in list
		// press ctrl+2+l
		List<WebElement> findElements = driver.findElements(By.xpath("//table[@id='table_id']//td[2]"));
		// create a empty list of string to store names
		List<String> names1 = new ArrayList<String>();
		// use for loop to store value in list names1
		for (int i = 0; i < findElements.size(); i++) {
			names1.add(findElements.get(i).getText());
		}
		// now names1 contains all names
		// sort that names1 using Collection
		Collections.sort(names1);
		// add thread.sleep
		// and click on the name header
		Thread.sleep(5);
		driver.findElement(By.xpath("//th[text()='Name']")).click();
		// now again inspect the name of webelement and store it in another list
		List<WebElement> findElements2 = driver.findElements(By.xpath("//table[@id='table_id']//td[2]"));
		// create a empty list of string to store names
		List<String> names2 = new ArrayList<String>();
		// use for loop to store value in list names1
		for (int i = 0; i < findElements2.size(); i++) {
			names2.add(findElements2.get(i).getText());
		}
		//after clicking on name header again repeating the steps inorder to store names as same above in another list
		//to check whether it is sorted after clicking on name header
		//now use if condition to check both list
		if (names1.equals(names2)) {
			System.out.println("passed");		
		} else {
			System.out.println("failed");
		}

	}

}
