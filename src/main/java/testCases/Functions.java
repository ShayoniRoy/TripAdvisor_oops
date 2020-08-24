package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Functions {

		By calender= By.xpath("//*[@id=\"component_2\"]/div/div[2]/div/div/div/div[1]/div") ;
		//div[@class='lRYY2wxe']
		By next= By.xpath("//div[contains(@class,'ui_icon single-chevron-right-circle _3D4AxZN5')]");

		
		By check_in= By.xpath("//body[@id='BODY_BLOCK_JQUERY_REFLOW']//div//div//div//div//div//div//div[1]//div[3]//div[3]//div[3]");
		By check_out= By.xpath("//body[@id='BODY_BLOCK_JQUERY_REFLOW']/div/div/div/div/div/div/div/div[1]/div[3]/div[4]/div[1]");
		

	
		By guests= By.xpath("//div[contains(text(),'Guests')]");
		By increase_guests= By.xpath("//body[@id='BODY_BLOCK_JQUERY_REFLOW']//div//div//div//div//div[2]//div[1]//div[2]//span[2]//span[1]");

		By apply= By.xpath("//button[contains(text(),'Apply')]");
		By sort= By.xpath("//*[@id=\"component_2\"]/div/div[3]/div/div[1]/div[2]/div[1]/div[2]/div/div/div/div[2]/span");
		//*[@id="component_2"]/div/div[3]/div/div[1]/div[2]/div[1]/div[2]/div/div/div/div[2]/span
		By rating =By.xpath("//span[contains(text(),'Traveller Rating')]");
		By amenities=By.xpath("//*[@class='_2PiY6cu3' and contains(text(),'Amenities')]/following-sibling::div[5]");
		By elevator= By.xpath("//*[@class='_2PiY6cu3' and contains(text(),'Amenities')]/following-sibling::div[6]");
	
		
		
		
     	void getCalendar(WebDriver driver)
     	{
     	   driver.findElement(calender).click();
     	}
     	
     	void getNext(WebDriver driver)
     	{
     		driver.findElement(next).click();
     	}
     	void getCheckin(WebDriver driver)
     	{
     		driver.findElement(check_in).click();
     	}
     	void getCheckout(WebDriver driver)
     	{
     		driver.findElement(check_out).click();
     	}
     	WebElement getGuests(WebDriver driver)
     	{
     		return driver.findElement(guests);
     	}
     	void getIncreaseGuests(WebDriver driver)
     	{
     		driver.findElement(increase_guests).click();
     	}
     	void getApply(WebDriver driver)
     	{
     		driver.findElement(apply).click();
     	}
     	void getSort(WebDriver driver)
     	{
     		driver.findElement(sort).click();
     	}
     	void getRating(WebDriver driver)
     	{
     		driver.findElement(rating).click();
     	}
     	void getAmenities(WebDriver driver)
     	{
     		driver.findElement(amenities).click();
     	}
     	void getElevator(WebDriver driver)
     	{
     		driver.findElement(elevator).click();
     	}
}

	



