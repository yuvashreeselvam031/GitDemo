package leafground;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DownloadFile {

	

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/download.html");
		
		driver.findElement(By.linkText("Download Text")).click();
		/*
		 * Set<String> windowHandles = driver.getWindowHandles(); List<String> winList =
		 * new ArrayList<String>(windowHandles);
		 * driver.switchTo().window(winList.get(1));
		 */
		String text = driver.findElement(By.xpath("//pre[@style='word-wrap: break-word; white-space: pre-wrap;']")).getText();
		System.out.println(text);
		

	}

}
