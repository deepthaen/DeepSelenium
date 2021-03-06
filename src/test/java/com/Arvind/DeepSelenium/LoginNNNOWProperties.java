package com.Arvind.DeepSelenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;



public class LoginNNNOWProperties {
	
	public LoginNNNOWProperties(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='LOGIN']")
	public WebElement Login;
	
	@FindBy(xpath="//input[@name='text']")
	public WebElement email;
	
	@FindBy(xpath="//input[@name='password']")
	public WebElement password;
	
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement loginButton;

	
	public String getpropvalue(String key) 
	{
		try {
			FileInputStream file = new FileInputStream("./test-output/Config.properties");
			Properties prop = new Properties();
			prop.load(file);
			String propValue = prop.getProperty(key);
			return propValue;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return key;
		
				}




public void enterCredentials() {

	
    String un = getpropvalue("UserName");
	String pwd = getpropvalue("password");
	Reporter.log("Logging With :: "+un,true);
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, 30);
		 * wait.until(ExpectedConditions.elementToBeClickable(Login));
		 */
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Login.click();
	email.sendKeys(un);
	System.out.println(un);
	password.sendKeys(pwd);
	System.out.println(pwd);
	loginButton.click();
	
}


	
	
}