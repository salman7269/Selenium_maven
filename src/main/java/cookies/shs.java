package cookies;

import org.testng.annotations.Test;

public class shs {
	@Test
	public void solo()
	{
		System.out.println("0");
	}

	@Test(priority=-1)
	public void sol()
	{
		System.out.println("-1");
	}

	@Test(priority=-2)
	public void so()
	{
		System.out.println("-2");
	}

	@Test(priority=2)
	public void so2()
	{
		System.out.println("2");
	}
	}

