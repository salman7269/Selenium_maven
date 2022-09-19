package ApachePOI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Ex_1 {
/*
 
 Structure:-
 --------------
 
 
 Excel--->WorkBook--->Sheets--->Rows--->Cells
 
 FileInputStream--->To read the data from ExcelSheet
 XSSFWorkBook------>To read the data form workbook.
 XSSFSheet--------->To access the sheets
 XSSFRow----------->To access the rows
 XSSFCell---------->To access the cells   
 
  
 */
	public static void main(String[] args) throws IOException {

FileInputStream file= new FileInputStream("D://Sample_ApachePOI_Data.xlsx");//providing the location of excel file.
		
XSSFWorkbook workbook= new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1"); //providing the name of sheet
		//workbook.getSheetAt(0);//providing the index of sheet
		
		int rowcount=sheet.getLastRowNum();
		int columncount=sheet.getRow(0).getLastCellNum();
		
for(int i=0; i<=rowcount; i++)
{
	sheet.getRow(i); //focus on the currentrow
	
	for(int j=0; j<columncount; j++)
	{
		System.out.print( sheet.getRow(i).getCell(j).toString()+"          "); //read the cell data
	}
	System.out.println();
}


	}

}
