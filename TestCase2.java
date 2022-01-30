package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
		//Create instance for Chrome driver
		 ChromeDriver driver = new ChromeDriver();
		//Launch URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Maximize window
		driver.manage().window().maximize();			
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		//Click CRM/SFA
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		//Click Contacts Tab
		driver.findElement(By.linkText("Contacts")).click();
		//Click Find Contacts
		driver.findElement(By.linkText("Find Contacts")).click();
		//Click Email Tab
		driver.findElement(By.linkText("Email")).click();
		//Type email as babu@testleaf.com
		driver.findElement(By.name("emailAddress")).sendKeys("babu@testleaf.com");
		//Click Find Contacts
		driver.findElement(By.id("ext-gen212")).click();
		//Close the browser
		driver.close();	
	}
}
