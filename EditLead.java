package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		/*http://leaftaps.com/opentaps/control/main
		
		* 1	Launch the browser
		* 2	Enter the username
		* 3	Enter the password
		* 4	Click Login
		* 5	Click crm/sfa link
		* 6	Click Leads link
		* 7	Click Find leads
		* 8	Enter first name
		* 9	Click Find leads button
		* 10 Click on first resulting lead
		* 11 Verify title of the page
		* 12 Click Edit
		* 13 Change the company name
		* 14 Click Update
		* 15 Confirm the changed name appears
		* 16 Close the browser (Do not log out)
		*/
				

		 WebDriverManager.chromedriver().setup();
		 
		 ChromeDriver driver = new ChromeDriver();
		 
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 
		 driver.manage().window().maximize();
		 
		 //* 2. Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		 		  
		driver.findElement(By.className("decorativeSubmit")).click();
		 
		 //* 4. Click on CRM/SFA Link
		 
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//label[text()='First name:'])[3]/following::input")).sendKeys("Gayathri");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//td[@tabindex=\"0\"]//a)[3]")).getText();
		
		driver.findElement(By.xpath("(//td[@tabindex=\"0\"]//a)[3]")).click();
		
		if((driver.getTitle()).contains("View Lead")) {
			
			System.out.println("inside loop");
			
			driver.findElement(By.linkText("Edit")).click();
			
			driver.findElement(By.id("updateLeadForm_companyName")).clear();
			
			driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("ABC");
			
			driver.findElement(By.xpath("//input[@name=\"submitButton\"]")).click();
			
		}
		
		driver.close();

	}

}
