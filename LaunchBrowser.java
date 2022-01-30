package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	public static void main(String[] args) {
		//Set environment
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
		//Create instance for Chrome driver
		 ChromeDriver driver = new ChromeDriver();
		//Launch URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Maximize window
		driver.manage().window().maximize();
		//Close Browser
		driver.close();
	}

}
