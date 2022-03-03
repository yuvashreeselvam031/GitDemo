package ExplicitlyWait;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) {
		// load the browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		// load url
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		//Select the languages that you know?
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		//Confirm Selenium is checked using isSelectd method
		boolean selected = driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']/following::input")).isSelected();
		if (selected) {
			System.out.println("selected");
		} else {
			System.out.println("not selected");
		}
		//DeSelect only checked
		//for that we need to use list
		//both having same xpath
		// we can use findElements //ctrl+2+l
		List<WebElement> findElements = driver.findElements(By.xpath("//label[text()='DeSelect only checked']/following::input"));
		//give a if condition to deselect only checked
		//first iterate through the webelement then give if condition if the webelement checked already it has to be unchecked
		for (int i = 0; i < findElements.size(); i++) {
			if (findElements.get(i).isSelected()) {
				findElements.get(i).click();
			}
		}
		//if it is not selected it will ignored
		//Select all below checkboxes
		//for that also we need to use list
		List<WebElement> findElements2 = driver.findElements(By.xpath("//label[text()='Select all below checkboxes ']/following::input"));
		//iterate the list to select all the options
		for (int i = 0; i < findElements2.size(); i++) {
			findElements2.get(i).click();
		}

	}

}
