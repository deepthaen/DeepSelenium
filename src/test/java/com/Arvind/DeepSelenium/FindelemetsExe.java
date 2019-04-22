package com.Arvind.DeepSelenium;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class FindelemetsExe {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\DEEPTHA.NAIK\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.nnnow.com/men_wallets");
		System.out.println("Launched Browser By Chrome");
		
		// max screen
		driver.manage().window().maximize();
		System.out.println("Maximized Screen");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		 System.out.println("scroll botton of page");
		 
		 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		List<WebElement> rows = driver.findElements(By.xpath("//div[@class='nw-productview-producttitle']"));

		// print the total number of elements
		System.out.println("Product Count" + rows.size());

		// Now using Iterator we will iterate all elements
				Iterator<WebElement> iter = rows.iterator();

				// this will check whether list has some element or not
				while (iter.hasNext()) {

					// Iterate one by one
					WebElement item = iter.next();

					// get the text
					String label = item.getText();

					// print the text
					System.out.println("Product Name" + label);
				}

	}
	
	
	

}
