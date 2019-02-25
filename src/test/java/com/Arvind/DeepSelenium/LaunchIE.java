package com.Arvind.DeepSelenium;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverLogLevel;
import org.openqa.selenium.ie.InternetExplorerDriverService;

public class LaunchIE {
	
	public WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	WebDriver driver;
	
	System.out.println("*******************");
	System.out.println("launching IE browser");
	
	System.setProperty("webdriver.ie.driver", "C:\\Users\\DEEPTHA.NAIK\\Downloads\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
	
	InternetExplorerDriverService service = new InternetExplorerDriverService.Builder()
		      .withLogLevel(InternetExplorerDriverLogLevel.TRACE)
		      .withLogFile(new File("iedriver.log"))
		      .build();
	
	driver = new InternetExplorerDriver(service);
	
	driver.get("https://google.com");
	driver.manage().window().maximize();
	}

}
