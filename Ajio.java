package week3.org.assignments;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/***1. Launch the URL https://www.ajio.com/
			2. In the search box, type as "bags" and press enter
			3. To the left  of the screen under " Gender" click the "Men"
			4. Under "Category" click "Fashion Bags"
			5. Print the count of the items Found. 
			6. Get the list of brand of the products displayed in the page and print the list.
			7. Get the list of names of the bags and print it
			***/
		
		//Create a map to store  preferences 
		Map<String, Object> prefs = new HashMap<String, Object>();

		//add key and value to map as follow to switch off browser notification
		//Pass the argument 1 to allow and 2 to block
		prefs.put("profile.default_content_setting_values.notifications", 2);

		//Create an instance of ChromeOptions 
		ChromeOptions options = new ChromeOptions();

		// set ExperimentalOption - prefs 
		options.setExperimentalOption("prefs", prefs);

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.get(" https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("searchVal")).sendKeys("bags");
		driver.findElement(By.name("searchVal")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//label[contains(@class,'facet-linkname facet-linkname-l1l3nestedcategory')])[3]")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.className("length")).getText().split(" ")[0]);
		
		List<WebElement> brandList = driver.findElements(By.className("brand"));
		TreeSet<String> brandSet = new TreeSet<String>();
		for (WebElement webElement : brandList) {
			brandSet.add(webElement.getText());
		}
		System.out.println(brandSet.toString());
		

		List<WebElement> bagName = driver.findElements(By.className("nameCls"));
		TreeSet<String> bagSet = new TreeSet<String>();
		for (WebElement webElement : bagName) {
			bagSet.add(webElement.getText());
		}
		System.out.println(bagSet.toString());
	}

}
