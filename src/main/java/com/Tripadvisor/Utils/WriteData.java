package com.Tripadvisor.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {

	public void writeIntoExcel(String hotel, String Price, String fivenights,int row) throws Exception
	{
		//object of File class to open xlsx file
		File src=new File(System.getProperty("user.dir")+"//Excel//WriteExcel.xlsx");
		//object of FileInputStream class to read excel file
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		Sheet s=wb.getSheetAt(0);
	
		
		
		Row r=s.createRow(row);
		
		r.createCell(0).setCellValue(hotel);
		r.createCell(1).setCellValue(Price);
		r.createCell(2).setCellValue(fivenights);
				
		FileOutputStream fos=new FileOutputStream(src);
		wb.write(fos);
        fos.close();       		
	
}
}
