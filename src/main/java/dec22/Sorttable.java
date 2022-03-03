package dec22;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sorttable {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/sorttable.html");
		
		List<WebElement> findElements = driver.findElements(By.xpath("//table[@id='table_id']//td[2]"));
		List<String> names= new ArrayList<String>();
		for (int i = 0; i < args.length; i++) {
			String text = findElements.get(i).getText();
			names.add(text);
			System.out.println(text);
			
		}
		driver.close();
	}

}
