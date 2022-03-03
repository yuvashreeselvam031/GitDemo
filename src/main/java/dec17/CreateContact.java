package dec17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("yuva");
		driver.findElement(By.id("lastNameField")).sendKeys("shree");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("yuvashree");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("s");
		driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("Testing");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("create contact in leaftaps");
		driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("earth@gmail.com");
		WebElement state = driver.findElement(By.xpath("//select[@id='createContactForm_generalStateProvinceGeoId']"));
		Select drp = new Select(state);
		drp.selectByVisibleText("Alaska");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.xpath("//textarea[@name='description']")).clear();
		driver.findElement(By.xpath("//textarea[@name='importantNote']")).sendKeys("this is important note");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String title = driver.getTitle();
		System.out.println(title);
	}

}
