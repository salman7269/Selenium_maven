package TestNG;

import org.testng.annotations.DataProvider;

public class dataProviderClass {

	
	@DataProvider()
	public Object[][] testlogindata()
	{
		Object[][] data= new Object[5][1];
		
		data[0][0]="Admin";
		data[0][1]="password";
		
		data[1][0]="salimkahn";
		data[1][1]="password";
		
		data[2][0]="amit";
		data[2][1]="password";
		
		data[3][0]="lalala";
		data[3][1]="password";
		
		
		return data;
	}
}
