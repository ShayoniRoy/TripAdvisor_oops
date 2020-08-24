package com.pom.TripAdvisor_oops;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class HomePage 
{
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public abstract String getPageTitle();
	
	public abstract WebElement getElement(By xpath);

}
