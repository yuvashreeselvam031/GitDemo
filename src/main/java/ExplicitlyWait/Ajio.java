package ExplicitlyWait;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		// load the browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		// 1. Launch the URL https://www.ajio.com/
		driver.get("//www.ajio.com/");
		driver.manage().window().maximize();
		//2. In the search box, type as "bags" and press enter
		driver.findElement(By.xpath("//input[@role='combobox']")).sendKeys("bags",Keys.ENTER);
		//3. To the left  of the screen under " Gender" click the "Men"
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		//4. Under "Category" click "Fashion Bags"
		//give thread.sleep as it will load some time to click
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		//5. Print the count of the items Found. 
		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println(text);
		//6. Get the list of brand of the products displayed in the page and print the list.
		List<WebElement> brand = driver.findElements(By.xpath("//div[@class='brand']"));
		//7. Get the list of names of the bags and print it
		List<WebElement> name = driver.findElements(By.xpath("//div[@class='nameCls']"));
		//use for loop to get text from each webelement
		//both will have same size so print it in using same for loop
		for (int i = 0; i < brand.size(); i++) {
			System.out.println("brand: "+brand.get(i).getText());
			System.out.println("name: "+name.get(i).getText());
			System.out.println("");
		}
		
	}

}
