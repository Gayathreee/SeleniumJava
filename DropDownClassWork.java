package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownClassWork {

	public static void main(String[] args) {
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
			//Click on Leads Button	 
			driver.findElement(By.linkText("Leads")).click();
			//Click on create Lead Button	  
			driver.findElement(By.linkText("Create Lead")).click();
			
			//Select source using visible text 
			WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
			//Create obj for Select class using source Webelement			
			Select objSource = new Select(source);
			//Selet using visible text
			objSource.selectByVisibleText("Employee");
			
			//Select industry using value 
			WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
			//Create obj for Select class using source Webelement			
			Select objIndustry = new Select(industry);
			//Selet using visible text
			objIndustry.selectByValue("IND_FINANCE");
			
			//Select ownership using index
			WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
			//Create obj for Select class using source Webelement			
			Select objOwnership = new Select(ownership);
			//Selet using visible text
			objOwnership.selectByIndex(2);
			
	}
}
