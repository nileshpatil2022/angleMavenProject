package testclass;

import org.testng.annotations.Test;

public class Demo02 
{
    @Test
	public void m1()
	{
		System.out.println("software");
	}
    
    @Test(groups= {"jdk"})
	public void m2()
	{
		System.out.println("testing");
	}
    
    @Test
	public void m3()
	{
		System.out.println("selenium");
	}
    
    
    @Test(groups= {"jdk"})
	public void m4()
	{
		System.out.println("java");
	}
    
    
    
    
}
