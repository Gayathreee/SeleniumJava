package week4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TrainAssignment {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(); // Open a new chrome browser
        driver.manage().window().maximize(); // Maximize the opened chrome browser window
        driver.get("https://erail.in/"); // Loads the URL in the opened browser
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement from = driver.findElement(By.id("txtStationFrom"));
        from.clear();
        from.sendKeys("TPJ", Keys.TAB);
        WebElement to = driver.findElement(By.id("txtStationTo"));
        to.clear();
        to.sendKeys("MDU", Keys.TAB);
        driver.findElement(By.id("chkSelectDateOnly")).click();
       // Thread.sleep(1000);
        WebElement webTable = driver.findElement(By.xpath("//div[@id='divTrainsList']/table"));
        List<WebElement> listRows = webTable.findElements(By.tagName("tr"));
        //System.out.println(listRows.size());
        for (WebElement eachRow : listRows) {
        	//System.out.println(eachRow.getText());
			List<WebElement> listColumn = eachRow.findElements(By.tagName("td"));
			//System.out.println(listColumn.get(1).getText());
			if(listColumn.get(1).getText().contains("SF")){
				System.out.println(listColumn.get(1).getText());
				System.out.println(listColumn.get(0).getText());
			}
		}
	}

}
