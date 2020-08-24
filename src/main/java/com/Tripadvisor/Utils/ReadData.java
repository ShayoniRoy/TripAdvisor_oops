package com.Tripadvisor.Utils;
import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public String[] readFromExcel() throws Exception
	{

				  File src=new File(System.getProperty("user.dir")+"//Excel//ReadExcel.xlsx");
				 			
				   FileInputStream fis=new FileInputStream(src);
				 				   
				   XSSFWorkbook wb=new XSSFWorkbook(fis);
				   			       
				      XSSFSheet sh1= wb.getSheetAt(0);
				      
				      int rowCount=sh1.getLastRowNum();
				     
				      String str[]=new String[9];
				 
				    
				    int k=0;
				  for(int i=1;i<(rowCount+1);i++) //loop to get the row index
				  {
				      Row row=sh1.getRow(i);//storing the row of a particular index
				     for(int j=0;j<row.getLastCellNum();j++) //loop to get the elements of each row
				     {
				    	// Cell cell =row.getCell(j);
				    	 
				    		 str[k]=row.getCell(j).getStringCellValue(); //storing the elements 
				    	 
				    		 k++; //incrementing the count
				     }
				   
				}
				  
				  return str;
			}
			


	}

