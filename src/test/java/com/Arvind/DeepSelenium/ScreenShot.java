package com.Arvind.DeepSelenium;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.maven.surefire.shade.common.org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.annotations.Test;

import junit.framework.Assert;

import java.io.File;




public class ScreenShot {
  @Test
  public static void captureScreenMethod() throws Exception{
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DEEPTHA.NAIK\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  driver.get("https://www.nnnow.com");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 /* 
	  File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      FileUtils.copyFile(scrFile, new File("C:\\Users\\DEEPTHA.NAIK\\Documents\\NNNOW.png"));
      */
      
      
      // Take Screen Shot of full page
/*      Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
      ImageIO.write(screenshot.getImage(),"PNG",new File("C:\\fullpagescreenshot.png"));     */
	  driver.close();
	  driver.quit(); 
	  }
  
}
