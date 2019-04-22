package com.Arvind.DeepSelenium;

import java.awt.Point;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\DEEPTHA.NAIK\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.nnnow.com");
		System.out.println("Launched Browser By Chrome");
		
		// max screen
		driver.manage().window().maximize();
		System.out.println("Maximized Screen");
		
		
       // Pgae title
		String pageTitle = driver.getTitle();
		System.out.println("Web Page Title :: " + pageTitle);
		
		// refresh page
		driver.navigate().refresh();
		System.out.println("Refresh Screen");
		
		// Scroll to botton of webpage
		JavascriptExecutor js = (JavascriptExecutor) driver;

		 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		 System.out.println("scroll botton of page");
		 //scroll top pf page
		js .executeScript("window.scrollTo(0, -document.body.scrollHeight)");
		System.out.println("scroll top of page");
	}}
/*
	// Mimize screen
		Dimension windowMinSize = new Dimension(100,100);
		driver.manage().window().setSize(windowMinSize);
				System.out.println("Minized Screen");
				
		driver.findElement(By.xpath("//span[contains(text(),'LOGIN')]")).click();
		driver.findElement(By.xpath("//input[@name='text']")).sendKeys("deeptha@arvindinternet.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("nnnow123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("Logged into website");
		
		//Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[text()='Trend of the week']"))));
		
		driver.findElement(By.xpath("//a[text()='Trend of the week']")).click();
		System.out.println("Clicked on element");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//body//div[@id='root']//div//div[contains(@class,'nw-app')]//div[contains(@class,'nw-app-body')]//div[contains(@class,'nw-listingpage-container')]//div[contains(@class,'nwc-grid-row')]//div[@class='nwc-grid-col nwc-grid-col-xs nw-listingpage-list']//div//div[contains(@class,'nwc-grid-row nw-productlist')]//div[@class='nwc-grid-col nw-productlist-mainlist']//div[contains(@class,'nwc-grid-row')]//div[contains(@class,'nwc-grid-col')]//div//div[@class='nwc-grid-row']//div[1]//a[1]//div[3]//div[2]//div[2]//img[1]")).click();
		System.out.println("Clicked on product");
		driver.quit();
       
	}*/

/*	
	public static DesiredCapabilities getChromeConfig() {


		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("disable-popup-blocking", true);
		chromePrefs.put("ignore-certifiate-errors", true);
		chromePrefs.put("credentials_enable_service", false);
		chromePrefs.put("profile.password_manager_enabled", false);

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setExperimentalOption("prefs", chromePrefs);
		chromeOptions.addArguments("disable-extensions");
		chromeOptions.addArguments("--start-maximized");
		chromeOptions.addArguments("--test-type");
		chromeOptions.addArguments("--no-sandbox");
		chromeOptions.addArguments("--disable-dev-shm-usage");
		//chromeOptions.addArguments("--headless");
		capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
		capabilities.setJavascriptEnabled(true);
		return capabilities;
	}  */
