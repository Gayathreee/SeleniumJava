package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase3 {
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
		//5. Click on Leads Button	 
		driver.findElement(By.linkText("Leads")).click();
		 //6. Click on create Lead Button	  
		driver.findElement(By.linkText("Create Lead")).click();
		 /*7. Enter all the fields in CreateLead page
	          **Note
	               1. Donot work on Parent Account Field
	               2.Enter the Birthdate using SendKeys*/
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Krishna");		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Bala");	
		
		driver.findElement(By.id("createLeadForm_dataSourceId")).sendKeys("Conference");		
		driver.findElement(By.id("createLeadForm_marketingCampaignId")).sendKeys("Affiliate Sites");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Krish");
		
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Bala");
		
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("KrishBala");
		
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("11/03/1993");
		
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Welcome KrishBala");
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Sales");
		
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("150000");
		
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("10");
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		driver.findElement(By.id("createLeadForm_ownershipEnumId")).sendKeys("Partnership");
		
		driver.findElement(By.id("createLeadForm_industryEnumId")).sendKeys("Distribution");
		
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("A123");
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Sales Lead");
		
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Nil");
		
		 //8. Enter all the fields in contact information  
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("1234");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("314");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("krish@testleaf.com");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9100012000");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Krish");
		
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("https://krish@testlea.com");
		
		
		//9. Enter all the fields in primary address	 
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Krish");
		
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("KrishBala");
		
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("123,abc street");
		
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("United states");
		
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Washington");
		
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("Alabama");
		
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("666");
		
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("666");

		
		 //10. Click on create Lead Button
		driver.findElement(By.className("smallSubmit")).click();
		
		//Close the browser
		driver.close();

	}

}
