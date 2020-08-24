package testCases;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Tripadvisor.Utils.ReadData;
import com.Tripadvisor.Utils.Screenshots;
import com.Tripadvisor.Utils.WriteData;
import com.pom.TripAdvisor_oops.BaseClass;
import com.pom.TripAdvisor_oops.HomePage;
import com.pom.TripAdvisor_oops.TripAdvisor;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class BaseTest 
{
	
WebDriver driver;
public TripAdvisor page;	
public ExtentTest test;
public ExtentReports report;
public Logger logger;

ReadData read;
WriteData write;
Screenshots shots;


	@BeforeTest(groups= {"smoke", "regression"})
	void setupDriver()
	{
		logger=Logger.getLogger("");
		 PropertyConfigurator.configure("Log4j.properties");
		System.setProperty("webdriver.chrome.driver","C:/Users/hp/Desktop/chromedriver.exe" );
	   
	    driver = new ChromeDriver();
	    
	    report = new ExtentReports(System.getProperty("user.dir")+"\\ExtentReportResults.html");
		 test = report.startTest("BaseTest");
	  
	}
	
	
		 @AfterTest(groups= {"smoke", "regression"})
		    void closeBrowser()
		    {
		    driver.close();
			  report.endTest(test);
			  report.flush();
			}
}