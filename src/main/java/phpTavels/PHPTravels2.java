package phpTavels;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PHPTravels2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		List<WebElement> table = driver.findElements(By.xpath("//table[@id='data']//td"));
		int size = table.size();
	//	System.out.println(size);
	 //   System.out.println(table.get(1).findElement(By.xpath("//table[@id='data']//td[9]/strong")).getText());
	    String value = "336.6";
	   
	    for (WebElement webElement : table) {
	    	try {
				List<WebElement> price = webElement.findElements(By.xpath("//table[@id='data']//td[9]/strong[text()='"+value+"']/preceding::td[7]"));
				System.out.println();
			} catch (Exception e) {
				System.out.println("no records found");
			}
		}
	   
	}

}
