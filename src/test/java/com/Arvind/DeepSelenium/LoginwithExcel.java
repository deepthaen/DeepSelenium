package com.Arvind.DeepSelenium;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import dataexcel.ReadExcel;

public class LoginwithExcel {

	
		
		public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
			// TODO Auto-generated method stub

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\DEEPTHA.NAIK\\Downloads\\chromedriver_win32\\chromedriver.exe");

			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			WebDriver driver = new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http://www.nnnow.com");
			System.out.println("Launched Browser By Chrome");

			driver.manage().window().maximize();
			System.out.println("Maximized Screen");
			
			LoginUsingExcelData lnp = new LoginUsingExcelData(driver);
			
			lnp.enterCredentials();
			
			ReadExcel.readCredentials("test1", "UserName");
			ReadExcel.readCredentials("test1", "Password");
			

	}

}
