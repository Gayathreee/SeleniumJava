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

import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceNowFrames {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*
		 * Your instance URL:https://dev71708.service-now.com
		 * 
		 * Username: admin Current password: VbVhnRk6rN4G
		 */
		
		/**
		 * Assignment 2: ServiceNow - Frames ----------------------------------
		 * 
		 * ServiceNow- Refer the attached document below for clarity to create your own
		 * instance( sign In credentials) to work with servicenow Refer the attached
		 * document for the flow of the application to complete the testcase
		 * 
		 * Step1: Load ServiceNow application URL Step2: Enter username (Check for frame
		 * before entering the username) Step3: Enter password Step4: Click Login Step5:
		 * Search “incident “ Filter Navigator Step6: Click “All” Step7: Click New
		 * button Step8: Select a value for Caller and Enter value for short_description
		 * Step9: Read the incident number and save it a variable Step10: Click on
		 * Submit button Step 11: Search the same incident number in the next search
		 * screen as below Step12: Verify the incident is created successful and take
		 * snapshot of the created incident.
		 */
			
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://dev71708.service-now.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@name='user_name' and @type='text']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password' and @type='password']")).sendKeys("Password@1");
		driver.findElement(By.name("not_important")).click();
		driver.findElement(By.id("filter")).sendKeys("incident");
		driver.findElement(By.xpath("(//div[contains(text(),'All')])[2]")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		driver.findElement(By.id("lookup.incident.caller_id")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowList = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windowList.get(1));
		driver.findElement(By.xpath("(//a[@class='glide_ref_item_link'])[1]")).click();
		driver.switchTo().window(windowList.get(0));
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='sys_display.incident.short_description']/following-sibling::input")).sendKeys("Short desc");
		driver.findElement(By.xpath("(//span[@class='navbar_ui_actions']/button)[1]")).click();
		String incidentNumber = driver.findElement(By.xpath("(//td[@class='vt'])[1]")).getText();
		driver.findElement(By.xpath("(//input[@placeholder='Search' and @class='form-control'])")).sendKeys(incidentNumber,Keys.ENTER);
		String incidentNumber2 = driver.findElement(By.xpath("(//td[@class='vt'])[1]")).getText();
		if(incidentNumber.equals(incidentNumber2)) {
			System.out.println("Incident has been created successfully");
		}
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./src/snap/ServiceNow.jpg");
		FileUtils.copyFile(src, dest);
		
	}

}
