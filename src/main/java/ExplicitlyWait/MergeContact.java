package ExplicitlyWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
		// load the browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		// 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		// 2. Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// 3. Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		//4. Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//5. Click on contacts Button
		driver.findElement(By.linkText("Contacts")).click();
		//6. Click on Merge Contacts using Xpath Locator
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		
		//7. Click on Widget of From Contact
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		//8. Click on First Resulting Contact
		//inorder to click we have to use window handling
		//ctrl+2+l
		Set<String> windowHandles = driver.getWindowHandles();
		//create an empty list to store windowhandles inorder to get windowhandles in order
		List<String> winList = new ArrayList<String>(windowHandles);
		//now get into the first window
		//0 is the default window 1 is the new opened window
		driver.switchTo().window(winList.get(1));
		//to click on first resulting contact
		//add Thread.sleep 
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		
		// 9. Click on Widget of To Contact
		//to click that first handle should come to default window for that
		driver.switchTo().window(winList.get(0));
		//10. Click on Second Resulting Contact
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		//again use window handle
		Set<String> windowHandles2 = driver.getWindowHandles();
		//create an empty list to store windowhandles inorder to get windowhandles in order
		List<String> winList2 = new ArrayList<String>(windowHandles2);
		//get into the window
		driver.switchTo().window(winList2.get(1));
		//add Thread.sleep
		Thread.sleep(3000);
		//now click on the second resulting contact
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();
		//get the handle to default window
		driver.switchTo().window(winList2.get(0));
		//11. Click on Merge button using Xpath Locator
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		//12. Accept the Alert
		driver.switchTo().alert().accept();
		//13. Verify the title of the page
		String title = driver.getTitle();
		if (title.contains("View Contact")) {
			System.out.println("passed");
		} else {
			System.out.println("failed");

		}
		
		
		
	
		
		
		
		
	}

}
