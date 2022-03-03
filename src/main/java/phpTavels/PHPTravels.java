package phpTavels;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PHPTravels {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option); 	
		driver.get("https://phptravels.net/api/supplier");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//label[@class='pure-material-textfield-outlined']/input")).sendKeys("supplier@phptravels.com");
		driver.findElement(By.xpath("(//label[@class='pure-material-textfield-outlined']/input)[2]")).sendKeys("demosupplier");
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		driver.findElement(By.xpath("//div[text()='Confrimed Bookings']")).click();
		List<WebElement> price = driver.findElements(By.xpath("//table[@id='data']//td[9]/strong"));
		price.forEach(games -> System.out.println(games.getText()));
		System.out.println("-------------------------------");
		for (WebElement webElement : price) {
			System.out.println(webElement.getText());
		}
		List<WebElement> id = driver.findElements(By.xpath("//table[@id='data']//td[2]"));
	    int count =0;
		boolean flag = false;
		for (int i = 0; i < price.size(); i++) {
			
			
			String text = price.get(i).getText();
			
				if (text.equals("336.6")) {
					System.out.println(id.get(i).getText());
					count++;
				}
		
				
				
			}
			
		
		if (count==0) {
			System.out.println("no records found");
		}else {
			System.out.println("count "+count);
		}
		
	}

}
