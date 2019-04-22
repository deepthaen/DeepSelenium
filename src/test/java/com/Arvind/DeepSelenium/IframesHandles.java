package com.Arvind.DeepSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IframesHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DEEPTHA.NAIK\\Downloads\\chromedriver_win32\\chromedriver.exe");

		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.sanfoundry.com/java-program-sort-array-ascending-order/");
		System.out.println("Launched Browser By Chrome");
		driver.manage().window().maximize();

		driver.switchTo().frame("iframe_177802589820");
		driver.findElement(By.id("ftalt3648595")).click();    //img[@id='ftalt3648595']


	}

}
