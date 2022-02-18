package week4;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//TODO 1. Launch URL "http://leaftaps.com/opentaps/control/login"

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/login");

		driver.manage().window().maximize();

		//TODO 2. Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		//TODO 3. Click on Login Button using Class Locator

		driver.findElement(By.className("decorativeSubmit")).click();

		//TODO 4. Click on CRM/SFA Link

		driver.findElement(By.partialLinkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Contacts")).click();

		driver.findElement(By.linkText("Merge Contacts")).click();

		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();

		Set<String> windowHandles = driver.getWindowHandles();

		List<String> windowList = new ArrayList<String>(windowHandles);

		driver.switchTo().window(windowList.get(1));

		driver.findElement(By.xpath("//div[@id='ext-gen247']//td/div//a")).click();

		driver.switchTo().window(windowList.get(0));

		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();

		Set<String> windowHandles1 = driver.getWindowHandles();

		List<String> windowList1 = new ArrayList<String>(windowHandles1);
		
		driver.switchTo().window(windowList1.get(1));
		
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.xpath("(//div[@id='ext-gen247']/div/following-sibling::div//div/a)[1]")).click();
		
		driver.switchTo().window(windowList.get(0));
		
		driver.findElement(By.linkText("Merge")).click();
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		
		System.out.println(driver.getCurrentUrl());

	}

}
