package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 {
	
	public static void main(String[] args) {
		/*System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");*/
		 WebDriverManager.chromedriver().setup();
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
		//Click Create Contact
		driver.findElement(By.linkText("Create Contact")).click();
		//Type First Name
		driver.findElement(By.id("firstNameField")).sendKeys("Gayathri");
		//Type Last Name
		driver.findElement(By.id("lastNameField")).sendKeys("Balakrishnan");
		//Click Create Contact Button
		driver.findElement(By.className("smallSubmit")).click();
		//Print the first name and browser title 
		
		//Close the browser
		driver.close();	
	}

}
