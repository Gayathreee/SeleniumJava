package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			//================================
			// Step 1: Download and set the path 
			WebDriverManager.chromedriver().setup();
			// Step 2: Launch the chromebrowser
			ChromeDriver driver = new ChromeDriver();
			// Step 3: Load the URL https://en-gb.facebook.com/
			driver.get("https://en-gb.facebook.com/");
			// Step 4: Maximise the window
			driver.manage().window().maximize();
			// Step 5: Add implicit wait
			Thread.sleep(2000);
			// Step 6: Click on Create New Account button
			driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]")).click();
			Thread.sleep(4000);			
			// Step 7: Enter the first name
			driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Gayathri");
			// Step 8: Enter the last name
			driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Harikumar");
			// Step 9: Enter the mobile number
			driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("1234567890");
			// Step 10: Enter the password
			driver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]")).sendKeys("Passowrd@1");
			// Step 11: Handle all the three drop downs
				//DropDown1 Day 
				WebElement day = driver.findElement(By.xpath("//select[@name=\"birthday_day\"]"));
				Select dayObj = new Select(day);
				dayObj.selectByIndex(10);
				//DropDown2
				WebElement month = driver.findElement(By.xpath("//select[@name=\"birthday_month\"]"));
				Select monthObj = new Select(month);
				monthObj.selectByIndex(2);
				//Dropdown3
				WebElement year = driver.findElement(By.xpath("//select[@name=\"birthday_year\"]"));
				Select yearObj = new Select(year);
				yearObj.selectByValue("1993");
				
			// Step 12: Select the radio button "Female" 
			     //  ( A normal click will do for this step) 
				//Alternate xpath : //input[@name="sex"][1]
			driver.findElement(By.xpath("//label[text()=\"Female\"]/following-sibling::input")).click();

	}

}
