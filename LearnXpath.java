package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnXpath {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//Create instance for Chrome driver
		 ChromeDriver driver = new ChromeDriver();	
		//Launch URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Maximize window
		driver.manage().window().maximize();			
		driver.findElement(By.xpath("(//input)[1]")).sendKeys("DemoCSR");
		driver.findElement(By.xpath("(//input)[2]")).sendKeys("crmsfa");
		driver.findElement(By.xpath("(//input)[3]")).click();
		//Click CRM/SFA
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();			
		//Click on Leads Button	 
		driver.findElement(By.xpath("(//a[contains(text(),'Leads')]")).click();
		//Click on create Lead Button	  
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
	}

}
