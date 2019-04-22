package com.Arvind.DeepSelenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WithoutSendkeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DEEPTHA.NAIK\\Downloads\\chromedriver_win32\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.naukri.com");
		System.out.println("Launched Browser By Chrome");
		
		Set<String> win = driver.getWindowHandles();
		System.out.println(win);
		String currentwindow = driver.getWindowHandle();
		
		for (String handle : win) {
			if (handle.contentEquals(currentwindow)) {
				driver.switchTo().window(currentwindow);
				String title = driver.getTitle();
				System.out.println(title);
			}
		}
		

		// max screen
		driver.manage().window().maximize();
		System.out.println("Maximized Screen");
		
		// get attribute
		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
		WebElement attri = driver.findElement(By.xpath("//input[@id='eLoginNew']"));
		System.out.println("attribute value " + attri.getAttribute("placeholder"));
		
		/*	// click without click method
		WebElement el = driver.findElement(By.xpath("//input[@value='Register with us']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", el); */
		
		
		
	//	driver.findElement(By.xpath("//span[contains(text(),'LOGIN')]")).click();
		WebElement name = driver.findElement(By.xpath("//input[@id='eLoginNew']"));
		
		//enter text without using sendkeys
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].value='deepthaen@gmail.com';", name);
		System.out.println(name);   
			
		// enter text using keyboard action
	/*	
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(Keys.ENTER);  */
/*
		// Check if element is clickable in webpage
		WebDriverWait wait = new WebDriverWait(driver, 5);
	    wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@value='Register with us']"))));
	    System.out.println("Element is clickable "); */
	}

}
