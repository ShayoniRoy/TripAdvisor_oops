package com.Tripadvisor.Utils;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshots {

	public static String takeSnapShot(WebDriver webdriver,String screenShotName) throws Exception{

        //Convert web driver object to TakeScreenshot
        TakesScreenshot scrShot =((TakesScreenshot)webdriver);
        //Call getScreenshotAs method to create image file
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        
        String dest = System.getProperty("user.dir")+"\\Screenshots\\"+screenShotName+".jpg";
        //Move image file to new destination
        File DestFile=new File(dest);
        //Copy file at destination
        FileUtils.copyFile(SrcFile, DestFile);
        
        return dest;

	}

}
