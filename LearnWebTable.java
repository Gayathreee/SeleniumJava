package week4;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.model.ScreenCapture;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.SelfInjection.Split;

public class LearnWebTable {



	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub		
		int size = 0;
		int progressValue = 0 ;
		int lastValueIndex =0;
		String checkBoxXpath ;
		
		List<Integer> progressList =  new ArrayList<Integer>();

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/table.html");
		WebElement tableElement = driver.findElement(By.id("table_id"));
		List<WebElement> listRows = tableElement.findElements(By.tagName("tr"));

		for (WebElement eachRow : listRows) {
			List<WebElement> listColumns = eachRow.findElements(By.tagName("td"));

			if (listColumns.size()!=0) {
				progressValue = Integer.parseInt(listColumns.get(1).getText().replace("%",""));				
				progressList.add(progressValue);				
				if(listColumns.get(0).getText().contains("Learn to interact with Elements")) {
					System.out.println("Number of Columns: "+listColumns.get(1).getText());
					size = listColumns.size();
				}

			}
		}
	
		System.out.println("Number of Rows: " + listRows.size());

		List<Integer> sortedProgressList = new ArrayList<Integer>(progressList);
		Collections.sort(sortedProgressList);
	
		lastValueIndex = progressList.indexOf(sortedProgressList.get(0))+1;
		checkBoxXpath = "(//input[@type='checkbox'])" + "[" +lastValueIndex+ "]";
		driver.findElement(By.xpath(checkBoxXpath)).click();
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./src/snap/img001.jpg");
		FileUtils.copyFile(source, dest);


	}


}
