package dec17;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkboxes {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(); 	
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		boolean selected = driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']/following::input")).isSelected();
		System.out.println(selected);
		List<WebElement> findElements = driver.findElements(By.xpath("//label[text()='DeSelect only checked']/following::input"));
		for (int i = 0; i < findElements.size(); i++) {
			if (findElements.get(i).isSelected()) {
				findElements.get(i).click();
			}
		}
		List<WebElement> findElements2 = driver.findElements(By.xpath("//label[text()='Select all below checkboxes ']/following::input"));
		for (int i = 0; i < findElements2.size(); i++) {
			findElements2.get(i).click();
		}

	}

}
