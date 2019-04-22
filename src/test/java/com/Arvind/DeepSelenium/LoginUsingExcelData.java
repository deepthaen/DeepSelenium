package com.Arvind.DeepSelenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import dataexcel.ReadExcel;

public class LoginUsingExcelData {

	public LoginUsingExcelData(WebDriver driver) {
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




public void enterCredentials() throws EncryptedDocumentException, InvalidFormatException, IOException {

	String testcase= "test1";
	String username = ReadExcel.readCredentials(testcase, "UserName");
	String pwd = ReadExcel.readCredentials(testcase, "Password");

	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Login.click();
	email.sendKeys(username);
	System.out.println(username);
	password.sendKeys(pwd);
	System.out.println(pwd);
	loginButton.click();
	
}
}
