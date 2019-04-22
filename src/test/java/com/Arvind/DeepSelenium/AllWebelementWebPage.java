package com.Arvind.DeepSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllWebelementWebPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\DEEPTHA.NAIK\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		System.out.println("Launched Browser By Chrome");
		
		String ExptedText = "Google Search";
		Boolean ActualText =driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@value='Google Search']")).isDisplayed();
        System.out.println("Text is visible "  + ActualText);
		
		
				
		
		driver.manage().window().maximize();
		
	
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		 
		 System.out.println(links.size());
		 
		 for (int i = 1; i<=links.size()-1; i=i+1)
		 
		 {
		 
		 System.out.println(links.get(i).getText());
		 
		 } 

	}   

}
