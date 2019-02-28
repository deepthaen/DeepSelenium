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
import org.testng.Reporter;



public class LoginNNNOWProperties {
	
	@FindBy(xpath="//span[contains(text(),'LOGIN')]")
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
			FileInputStream file = new FileInputStream("./Config.properties");
			Properties prop = new Properties();
			prop.load(file);
			String propValue = prop.getProperty(key);
			return propValue;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return key;
		
				}




public LoginNNNOWProperties enterCredentials extends ()
{
	
    String un = getpropvalue("UserName");
	String pwd = getpropvalue("password");
	Reporter.log("Logging With :: "+un,true);
	
	Login.click();
	email.sendKeys(un);
	System.out.println(un);
	password.sendKeys(pwd);
	System.out.println(pwd);
	loginButton.click();
	return this;
}
}