package ApachePOI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ex_3 {

	public static void main(String[] args) throws IOException {

		FileInputStream file= new FileInputStream("D:/Medicine.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet=  workbook.getSheet("Medicine");
		int row=sheet.getLastRowNum();
		int column=sheet.getRow(0).getLastCellNum();
		
		for(int i=0; i<=row; i++)
		{
			sheet.getRow(i);
			
			for(int j=0; j<column; j++)
			{
		System.out.print(sheet.getRow(i).getCell(j).toString()+"          ");		
			}
			System.out.println();
		}
		
	}

}
