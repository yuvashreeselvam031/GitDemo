package ExplicitlyWait;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FunWithFrames {

	public static void main(String[] args) throws IOException {
		// load the browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		// load url
		driver.get("http://leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		
		/*
		 * http://leafground.com/pages/frame.html 
		 * 1.Take the the screenshot of the click
		 * me button of first frame 
		 * 2.Find the number of frames - 
		 * find the Elements by tagname - iframe - Store it in a list - Get the size of the list. (This gives
		 * the count of the frames visible to the main page)
		 */
		
		//1. click the click me button
		//it is inside a frame first get into the frame then locate click me
		//locate the frame
		WebElement frame1 = driver.findElement(By.xpath("//div[@id='wrapframe']/iframe"));
		//get into first frame
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//button[@id='Click']")).click();
		//to take snap first create a folder
		//take snap 
		File source = driver.getScreenshotAs(OutputType.FILE);
		//create file location to copy the screenshot
		File target = new File("./images/snap.png");
		//using FileUtils copy the source to target file
		FileUtils.copyFile(source, target);
		//now get out of the frame
		driver.switchTo().defaultContent();
		//to get number of frame use tagname and findelements
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		//get the size of the list that will give the number of frame visible to the main page
		int size = frames.size();
		System.out.println("Number of frame visible to main page: "+size);
		//check the snap
		
		
		
	}

}
