package TestNG_Parameters;

import org.testng.annotations.DataProvider;

public class dataorange {
@DataProvider
public String[][] logindata()
{
	String[][] data= new String [5][2];
	data[0][0]="Admin";
	data[0][1]="admin123";
	
	data[1][0]="Admin";
	data[1][1]="Admin";
	
	data[2][0]="admin123";
	data[2][1]="admin123";
	
	data[3][0]="PaulCollings";
	data[3][1]="paul123";
	
	data[4][0]="admin";
	data[4][1]="admin123";
	
	return data;
	
	
}
}
