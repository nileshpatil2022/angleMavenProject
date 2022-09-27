package listener;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



public class Demo01 
{
	@Test
	public void m1()
	{
		System.out.println("hiii");
	}
	@Test
	public void m2()
	{
		
		System.out.println("by");
		Assert.assertTrue(false);
	}
	@Test
	public void m3()
	{
		System.out.println("hello");
	}

}
