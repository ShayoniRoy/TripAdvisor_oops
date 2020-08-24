package com.pom.TripAdvisor_oops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TripAdvisor extends BaseClass{

	//page locators
	
	private By place = By.xpath("//input[@placeholder='Where do you want to go?']");
	
	public By submit = By.xpath("//button[contains(@class,'form_submit')]");
	
	
	public TripAdvisor(WebDriver driver) 
	{
		super(driver);
		
	}
	
	public void getPlace()
	{
		getElement(place).sendKeys("Nairobi");
	}
	
	public void getSubmit(By xpath)
	{
		getElement(xpath).click();
	}

}
