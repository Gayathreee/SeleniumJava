package week4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.utils.FileUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		/*
		 * Assignment 8: =========== Amazon: 1.Load the uRL https://www.amazon.in/
		 * 2.search as oneplus 9 pro 3.Get the price of the first product 4. Print the
		 * number of customer ratings for the first displayed product 5. click on the
		 * stars 6. Get the percentage of ratings for the 5 star. 7. Click the first
		 * text link of the first image 8. Take a screen shot of the product displayed
		 * 9. Click 'Add to Cart' button 10. Get the cart subtotal and verify if it is
		 * correct.
		 */
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("OnePlus 9 Pro",Keys.ENTER);
	
		System.out.println(driver.findElement(By.xpath("(//*[@class=\"a-price-whole\"])[1]")).getText());
		System.out.println(driver.findElement(By.xpath("(//*[@role=\"button\"]/i/span)[1]")).getText());
		WebElement starRating = driver.findElement(By.xpath("(//*[@role=\"button\"]/i/span)[1]"));
		Actions action = new Actions(driver);
		action.moveToElement(starRating).click().perform();
		Thread.sleep(500);
		String attribute = driver.findElement(By.xpath("(//a[contains(@title,'5 stars')])[1]")).getAttribute("title");
		System.out.println("Number of percentage people rated 5 stars : "+attribute.substring(18, 21));
		
		driver.findElement(By.xpath("(//h2[contains(@class,\"a-size-mini\")])[1]")).click();	
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowList = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windowList.get(1));
		
		WebElement findElement = driver.findElement(By.xpath("//div[@id='imgTagWrapperId']"));
		File src = findElement.getScreenshotAs(OutputType.FILE);
		File dest = new File("./src/snap/Oneplus.jpg");
		FileUtils.copyFile(src, dest);
		
		driver.findElement(By.id("add-to-cart-button")).click();
		driver.findElement(By.id("attach-view-cart-button-form")).click();
		System.out.println(driver.findElement(By.xpath("(//span[@class='currencyINR'])[1]")).getText());
	}

}
