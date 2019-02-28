package com.Arvind.DeepSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DEEPTHA.NAIK\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.nnnow.com");
		System.out.println("Launched Browser By Chrome");

		driver.manage().window().maximize();
		System.out.println("Maximized Screen");
		
		LoginNNNOWProperties lnp = new LoginNNNOWProperties();
		lnp.enterCredentials();
	}

}
