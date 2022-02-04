package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		/*http://leaftaps.com/opentaps/control/main
		 
		1	Launch the browser
		2	Enter the username
		3	Enter the password
		4	Click Login
		5	Click crm/sfa link
		6	Click Leads link
		7	Click Find leads
		8	Click on Email
		9	Enter Email
		10	Click find leads button
		11	Capture name of First Resulting lead
		12	Click First Resulting lead
		13	Click Duplicate Lead
		14	Verify the title as 'Duplicate Lead'
		15	Click Create Lead
		16	Confirm the duplicated lead name is same as captured name
		17	Close the browser (Do not log out)
		
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
		
		//Click Email Tab
		driver.findElement(By.linkText("Email")).click();
		
		driver.findElement(By.name("emailAddress")).sendKeys("xyz@gmail.com");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(1000);
		
		String firstName = driver.findElement(By.xpath("(//td[@tabindex=\"0\"]//a)[3]")).getText();
		
		System.out.println(firstName);
		
		driver.findElement(By.xpath("(//td[@tabindex=\"0\"]//a)[1]")).click();
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		if(driver.getTitle().contains("Duplicate Lead")){
			
			System.out.println("Title is "+ driver.getTitle() );
			
		}else {
			
			System.out.println("Title doesnt match");
		}
		
		driver.findElement(By.className("smallSubmit")).click();
		
		String firstName2 = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		
		System.out.println(firstName2);
		
		System.out.println(firstName);
		
		if(firstName2.equals(firstName)){
			
			System.out.println("Duplicated name is same as edited name");
			
		}else 
			System.out.println("Duplicated name is not same as edited name");
				
		driver.close();
	}
}
	
