package ApachePOI;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Ex_12 {

	public static void main(String[] args) throws IOException {


		FileInputStream file= new FileInputStream("D:/API Test case docx.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		XSSFSheet sheet =workbook.getSheet("Sheet1");
		int row=sheet.getLastRowNum();
		int column= sheet.getRow(0).getLastCellNum();
		for(int i=1;i<=row; i++)
		{
			
			sheet.getRow(i);
			for(int j=1; j<=column; j++)
			{
		System.out.print(sheet.getRow(i).getCell(j).toString()+"      ");
			}
			System.out.println();
			
		}
		
	}

}
