package dec17;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FunWithFrames {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement findElement = driver.findElement(By.xpath("//div[@id='wrapframe']/iframe"));
		driver.switchTo().frame(findElement);
		driver.findElement(By.xpath("//button[@id='Click']")).click();
		File source = driver.getScreenshotAs(OutputType.FILE);
		File target = new File("./Images/snaps.png");
		FileUtils.copyFile(source, target);
		driver.switchTo().defaultContent();
		
		List<WebElement> findElements = driver.findElements(By.tagName("iframe"));
		System.out.println("number of frame available visible to page is: "+findElements.size());
	}

}
