package com.Arvind.DeepSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PagefactoryIniti {

	public PagefactoryIniti(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
