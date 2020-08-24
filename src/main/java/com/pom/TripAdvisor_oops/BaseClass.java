package com.pom.TripAdvisor_oops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseClass extends HomePage {

	public BaseClass(WebDriver driver) 
	{
		super(driver);
	}

	@Override
	public String getPageTitle() {
		
		return driver.getTitle();
	}

	@Override
	public WebElement getElement(By xpath) {
		WebElement element = driver.findElement(xpath);
		return element;
	}

	
	
	

}
