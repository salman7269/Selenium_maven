package ApachePOI;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ex_8 {

	public static void main(String[] args) throws IOException {

		FileInputStream file= new FileInputStream("D:/Sample_Employee_data_xlsx.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("uk-500");
		int row=sheet.getLastRowNum();
		int column=sheet.getRow(0).getLastCellNum();
		for(int i=0; i<row; i++)
		{
			sheet.getRow(i);
			for(int j=0; j<column; j++)
			{
		System.out.println(sheet.getRow(i).getCell(i).toString()+"          ");
			}
		}
		
	}

}
