package com.Arvind.DeepSelenium;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import dataexcel.ReadExcel;

public class Log {

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
		
		LoginNNNOWProperties lnp = new LoginNNNOWProperties(driver);
		
		lnp.enterCredentials();
		
		ReadExcel.readCredentials("test1", "UserName");
		ReadExcel.readCredentials("test1", "Password");
		
		
	}
	
	public static DesiredCapabilities getChromeConfig() {


		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 1);
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
	} 

}
