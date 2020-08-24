package testCases;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Tripadvisor.Utils.ReadData;
import com.Tripadvisor.Utils.Screenshots;
import com.Tripadvisor.Utils.WriteData;
import com.pom.TripAdvisor_oops.TripAdvisor;
import com.relevantcodes.extentreports.LogStatus;

public class MainTest extends BaseTest{

	
	Functions f=new Functions();
	
@Test(priority=0,groups= {"smoke", "regression"})
	
	void Search() throws Exception
	{
		page = new TripAdvisor(driver); 
		
		driver.get("https://www.tripadvisor.in/Rentals");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		
		System.out.println("HomePage :"+driver.getTitle());
		
		String path1 = Screenshots.takeSnapShot(driver, "HomePage");
		if(driver.getTitle().equals("Homestay, Holiday Rentals - Over 6,30,000 Holiday Homes - Tripadvisor"))
		{
		test.log(LogStatus.PASS, "Navigated to the HomePage Successful" + test.addScreenCapture(path1));
		 report.endTest(test);
		}
		else
		{
		test.log(LogStatus.FAIL, "Navigated to the HomePage Failed");
		}
		
//		
//		logger.trace("Trace");
//		logger.debug("Debug");
		logger.info("HomePage of Tripadvisor.in");
//		logger.warn("Warn");
//		logger.error("Error");
//		logger.fatal("Fatal");

		
		
		System.out.println("Page Title :"+page.getPageTitle());
		Assert.assertEquals(page.getPageTitle(),"Homestay, Holiday Rentals - Over 6,30,000 Holiday Homes - Tripadvisor", "False");

		page.getPlace();
		logger.info("Searchings rentals in Nairobi");
		page.getSubmit(page.submit);
		
		f.getCalendar(driver);
		
		String path2 = Screenshots.takeSnapShot(driver, "Nairobi_Rentals");
		Assert.assertEquals(driver.getTitle(), "THE 10 BEST Nairobi Houses, Apartments of 2020 | Tripadvisor - Book Villas in Nairobi, Kenya");
		test.log(LogStatus.PASS, "Navigated to the Nairobi Rentals Page" + test.addScreenCapture(path2));
		report.endTest(test);
		System.out.println("Nairobi :"+driver.getTitle());

	}
	@Test(priority=1, groups="regression")
	void filter() throws Exception
	{
		
		for(int i=1;i<=4;i++)
		    {
		    f.getNext(driver);
		     Thread.sleep(1000);
		    }
		   f.getCheckin(driver);
		   f.getCheckout(driver);
		   logger.info("Check-in and Check-out dates are selected");
		   
		   WebElement guest =  f.getGuests(driver);
		   guest.click();
		   
	
		   String path3 = Screenshots.takeSnapShot(driver, "Guest");
		   if(guest.getText().equals("Guests"))
		   {
			   test.log(LogStatus.PASS, "Guest attribute" + test.addScreenCapture(path3));
		   }
		   f.getIncreaseGuests(driver);
		   f.getIncreaseGuests(driver);
		   logger.info("Number of guests selected as 4");
		   f.getApply(driver);
		  

		   f.getSort(driver);
		   f.getRating(driver);
		    logger.info("Sorting according to traveller's rating");
		    
		 
		    
		    JavascriptExecutor jse = (JavascriptExecutor) driver;
		    jse.executeScript("window.scrollBy(0,1000)");
		    
		    f.getAmenities(driver);
		    f.getElevator(driver);
		    logger.info("Amenities selected as elevator access ");
		    System.out.println();
		    
	}
		    @Test(priority=2, groups="regression")
		    void printDetails() throws Exception
		    {
		    
		    	read=new ReadData();
		    	String strItems[]=read.readFromExcel();
		    	write=new WriteData();
		    	
		    	
		    	
		    	
		    	WebElement hotel1 = driver.findElement(By.xpath(strItems[0]));
		    	System.out.println("Hotel Name : "+hotel1.getText()); 
		    	WebElement pernight1 = driver.findElement(By.xpath(strItems[1]));
		    	System.out.println("Price per night : Rs "+pernight1.getText().substring(1));
		    	WebElement fivenights1 = driver.findElement(By.xpath(strItems[2])); 
		    	System.out.println("Price for 5 nights : Rs"+fivenights1.getText().substring(1));
		    	
		    	write.writeIntoExcel(hotel1.getText(),pernight1.getText(),fivenights1.getText(),1);  
		    	System.out.println();
		    	
		    	WebElement hotel2 = driver.findElement(By.xpath(strItems[3]));
		    	System.out.println("Hotel Name : "+hotel2.getText()); 
		    	WebElement pernight2 = driver.findElement(By.xpath(strItems[4]));
		    	System.out.println("Price per night: Rs "+pernight2.getText().substring(1));
		    	WebElement fivenights2 = driver.findElement(By.xpath(strItems[5])); 
		    	System.out.println("Price for 5 nights : Rs"+fivenights2.getText().substring(1));
		    	
    	        write.writeIntoExcel(hotel2.getText(),pernight2.getText(),fivenights2.getText(),2);  
		    	System.out.println();
		    	
		    	WebElement hotel3 = driver.findElement(By.xpath(strItems[6]));
		    	System.out.println("Hotel Name : "+hotel3.getText()); 
		    	WebElement pernight3 = driver.findElement(By.xpath(strItems[7]));
		    	System.out.println("Price per night: Rs "+pernight3.getText().substring(1));
		    	WebElement fivenights3 = driver.findElement(By.xpath(strItems[8])); 
		    	System.out.println("Price for 5 nights : Rs "+fivenights3.getText().substring(1));
		    	
		    	write.writeIntoExcel(hotel3.getText(),pernight3.getText(),fivenights3.getText(),3);  
		    	System.out.println();
		    	
//		    WebElement holidayHome1 = driver.findElement(By.xpath("//a[contains(text(),'Elegant Cosy Conquest')]"));
//		    System.out.println(holidayHome1.getText());
//		   
//		    WebElement perNight1 = driver.findElement(By.xpath("//div[contains(text(),'8,554')]"));
//		    System.out.println(perNight1.getText().substring(2)+" / per night");
//		    
//		    WebElement fiveNights1 = driver.findElement(By.xpath("//div[contains(text(),'42,774 / 5 nights')]"));
//		    System.out.println(fiveNights1.getText().substring(2));
//		    
//		    System.out.println();
//		    
//		    WebElement holidayHome2 = driver.findElement(By.xpath("//a[contains(text(),'Holiday Apartment 5 Rooms Junction Mall Nairobi')]"));
//		    System.out.println(holidayHome2.getText());
//		   
//		    WebElement perNight2 = driver.findElement(By.xpath("//div[contains(text(),'9,410')]"));
//		    System.out.println(perNight2.getText().substring(2)+" / per night");
//		    
//		    WebElement fiveNights2 = driver.findElement(By.xpath("//div[contains(text(),'47,052 / 5 nights')]"));
//		    System.out.println(fiveNights2.getText().substring(2));
//		    System.out.println();
//		    
//		    WebElement holidayHome3 = driver.findElement(By.xpath("//a[contains(text(),'The PINE LUSH -3 BDR (ALL ENSUITE) APARTMENT!2 MIN')]"));
//		    System.out.println(holidayHome3.getText());
//		   
//		    WebElement perNight3 = driver.findElement(By.xpath("//div[contains(text(),'13,003')]"));
//		    System.out.println(perNight3.getText().substring(2)+" / per night");
//		    
//		    WebElement fiveNights3 = driver.findElement(By.xpath("//div[contains(text(),'65,017 / 5 nights')]"));
//		    System.out.println(fiveNights3.getText().substring(2));
//		    

		    
		    }

}
