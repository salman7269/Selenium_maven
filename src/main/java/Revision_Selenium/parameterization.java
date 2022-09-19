package Revision_Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class parameterization {

	public static void main(String[] args) throws IOException {

		FileInputStream file= new FileInputStream("D://Maturity Value.xlsx/");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
	int row=sheet.getLastRowNum();
	int cell=sheet.getRow(0).getLastCellNum();
		
	for(int i=0; i<=row; i++)
	{
		sheet.getRow(i);
		for(int j=1; j<cell; j++)
		{
		System.out.print("   "+sheet.getRow(i).getCell(j).toString()+"   ");
		}
	System.out.println();}
		
	}

}
