package com.Arvind.DeepSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFireFox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\DEEPTHA.NAIK\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.nnnow.com");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
	}

}
