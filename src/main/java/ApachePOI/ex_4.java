package ApachePOI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//-->excel file--->workbook-->sheets-->rows--->cells
public class ex_4 {

	public static void main(String[] args) throws IOException {

		FileInputStream file= new FileInputStream("D:/TestCases- API.xlsx");
		
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int row=sheet.getLastRowNum();
		int column= sheet.getRow(0).getLastCellNum();
		
		for(int i=0; i<=row; i++)
		{
			sheet.getRow(i);
			
			for(int j=0; j<column; j++)
			{
			System.out.println("      "+sheet.getRow(i).getCell(j).toString());
			}
		}
		
	}

}
