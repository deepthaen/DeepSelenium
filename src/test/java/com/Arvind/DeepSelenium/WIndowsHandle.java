package com.Arvind.DeepSelenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WIndowsHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DEEPTHA.NAIK\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.naukri.com");
		System.out.println("Launched Browser By Chrome");

		// max screen
		driver.manage().window().maximize();
		System.out.println("Maximized Screen");
		
		String handle= driver.getWindowHandle();
		 
        System.out.println(handle);

        // Click on the Button "New Message Window"

        driver.findElement(By.xpath("//input[@value='Register with us']")).click();

        // Store and Print the name of all the windows open	              

//        Set handles = driver.getWindowHandles();

//        System.out.println(handles);

        // Pass a window handle to the other window

      /*  for (String handle1 : driver.getWindowHandles()) {

         System.out.println(handle1);

         driver.switchTo().window(handle1);

         } */
	}

}
