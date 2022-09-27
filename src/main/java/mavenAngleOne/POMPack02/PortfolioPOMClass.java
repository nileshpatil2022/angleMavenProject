package mavenAngleOne.POMPack02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PortfolioPOMClass 
{
	private WebDriver driver;
	
	
	@FindBy(xpath="//a[text()='Commodity']")
	private WebElement commodityTab;
	
	public void clickCommodityTab()
	{
		commodityTab.click();
	}
	
	
	@FindBy(xpath="//button[text()='START INVESTING']")
	private WebElement startButton;
	
	public String getTextStartButton()
	{
		String a=startButton.getText();
		return a;
	}

	public PortfolioPOMClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

}
