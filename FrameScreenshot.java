package week4;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/**
		 * Assignment 4: ------------ http://leafground.com/pages/frame.html 1.Take the
		 * the screenshot of the click me button of first frame 2.Find the number of
		 * frames - find the Elements by tagname - iframe - Store it in a list - Get the
		 * size of the list. (This gives the count of the frames visible to the main
		 * page)
		 */
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		
		//Screenshot
		driver.switchTo().frame(0);
		File screenshotAs = driver.findElement(By.id("Click")).getScreenshotAs(OutputType.FILE);
		File src = new File("./src/main/frame.jpg");
		FileUtils.copyFile(screenshotAs, src);
		driver.switchTo().defaultContent();
		List<WebElement> iframeList = driver.findElements(By.tagName("iframe"));
		int listSize = iframeList.size();
		System.out.println(listSize);
	}

}
