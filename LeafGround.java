package selenium;

import javax.swing.plaf.synth.SynthStyleFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*LeafGround Assignments
		*******
		**Note : Kindly refer the video attached to do the following assignments

		http://leafground.com/pages/Edit.html
		http://leafground.com/pages/Button.html
		http://leafground.com/pages/Link.html
		http://leafground.com/pages/Image.html
		http://leafground.com/pages/Dropdown.html
		http://leafground.com/pages/checkbox.html*/
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leafground.com/pages/Edit.html");
				
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		
		//System.out.println(driver.getPageSource());
		
		System.out.println(driver.findElement(By.id("email")).isDisplayed());
		
		System.out.println(driver.findElement(By.name("username")).isEnabled());
		
		driver.get("http://leafground.com/pages/Button.html");
		
		System.out.println(driver.findElement(By.id("position")).getLocation());
		
		System.out.println(driver.findElement(By.id("position")).getLocation().getX());
		
		System.out.println(driver.findElement(By.id("position")).getLocation().getY());
		
		System.out.println(driver.findElement(By.id("position")).getSize());
		
		System.out.println(driver.findElement(By.id("position")).getSize().getHeight());
		
		System.out.println(driver.findElement(By.id("position")).getSize().getWidth());
		
		System.out.println(driver.findElement(By.id("color")).getAttribute("style"));
		
		System.out.println(driver.findElement(By.id("color")).getCssValue("background-color"));
		
		System.out.println(driver.findElement(By.id("color")).getTagName());
				
		driver.get("http://leafground.com/pages/checkbox.html");
		
		System.out.println(driver.findElement(By.xpath("//label[text()=\"Confirm Selenium is checked\"]/following::div/input")).isSelected());
		
		
	} 

}
