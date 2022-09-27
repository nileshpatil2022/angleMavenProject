package mavenAngleOne.TestPack01;

import org.testng.Assert;
import org.testng.annotations.Test;

import mavenAngleOne.POMPack02.PortfolioPOMClass;



public class TC02VerifyCommodityTab extends Test_BaseClass
{

	@Test
	public void verifyCommodityTab()
	{
		PortfolioPOMClass pf=new PortfolioPOMClass(driver);
		
		pf.clickCommodityTab();
		String actualResult=pf.getTextStartButton();
		
		String expectedResult="START INVESTING";
		
		Assert.assertEquals(actualResult, expectedResult);
		
		
		
	}
}
