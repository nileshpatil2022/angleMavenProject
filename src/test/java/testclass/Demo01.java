package testclass;

import org.testng.annotations.Test;

public class Demo01 
{
	@Test(groups= {"test"})
	public void m1()
	{
		System.out.println("first");
	}
	
	@Test
	public void m2()
	{
		System.out.println("second");
	}
	
	@Test(groups= {"test"})
	public void m3()
	{
		System.out.println("third");
	}
	
	@Test
	public void m4()
	{
		System.out.println("forth");
	}

}
