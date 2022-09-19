package ApachePOI;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;






public class ex_6 {

	public static void main(String[] args) throws IOException {

		
		FileInputStream file= new FileInputStream("D:/fruits.xls");
		
		HSSFWorkbook workbook= new HSSFWorkbook(file);
		HSSFSheet sheet=workbook.getSheet("Sheet1");
		
		int row=sheet.getLastRowNum();
		int column= sheet.getRow(0).getLastCellNum();
		
		for(int i=0;i<=row;i++)
		{
			sheet.getRow(i);
			for(int j=0; j<column; j++)
			{
			System.out.print(sheet.getRow(i).getCell(j).toString()+"           ");
			}
			
			System.out.println();
		}
		
		
	}

}
