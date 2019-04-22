package com.Arvind.DeepSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DesiredCapFF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\DEEPTHA.NAIK\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		FirefoxProfile profile = new FirefoxProfile();
		 FirefoxOptions options = new FirefoxOptions();
		 profile.setPreference("browser.download.folderList", 2);
		 profile.setPreference("browser.download.manager.showWhenStarting", false);
		 profile.setPreference("browser.helperApps.neverAsk.openFile",
		      "text/csv,application/x-msexcel,application/excel,application/x-excel,application/vnd.ms-excel,image/png,image/jpeg,text/html,text/plain,application/msword,application/xml");
		 profile.setPreference("browser.helperApps.neverAsk.saveToDisk",
		"text/csv,application/x-msexcel,application/excel,application/x-excel,application/vnd.ms-excel,image/png,image/jpeg,text/html,text/plain,application/msword,application/xml");
		 profile.setPreference("browser.helperApps.alwaysAsk.force", false);
		 profile.setPreference("browser.download.manager.alertOnEXEOpen", false);
		 profile.setPreference("browser.download.manager.focusWhenStarting", false);
		 profile.setPreference("browser.download.manager.useWindow", false);
		 profile.setPreference("browser.download.manager.showAlertOnComplete", false);
		 profile.setPreference("browser.download.manager.closeWhenDone", false);
		 options.setProfile(profile);
		 WebDriver driver = new FirefoxDriver(options);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("https://www.nnnow.com");
			
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//span[contains(text(),'LOGIN')]")).click();
		 System.out.println("clicked on login");
			

	}

}
