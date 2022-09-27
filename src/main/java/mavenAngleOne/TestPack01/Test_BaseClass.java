package mavenAngleOne.TestPack01;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import mavenAngleOne.POMPack02.LoginPOMClass;
import mavenAngleOne.UtilityPack.Screenshot;

public class Test_BaseClass 
{
	 WebDriver driver;
	
	@Parameters("browserName")
	@BeforeMethod
	public void setUp(String browserName) throws IOException
	{
		if(browserName.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver",
				"./DriverFolder/chromedriver.exe");
		driver= new ChromeDriver();
		}
		else
		{
			System.setProperty("webdriver.gecko.driver",
					"./DriverFolder/geckodriver.exe");
			 driver= new FirefoxDriver();
		}
		System.out.println("Browser is opened");
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");
		driver.get("https://trade.angelbroking.com/Login");
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        System.out.println("URL is Opened");
        Screenshot.screenshot(driver);
        
        LoginPOMClass lg=new LoginPOMClass(driver);
        lg.sendUserID();
        System.out.println("username is entered");
        lg.sendPassword();
        System.out.println("password is entered");
        lg.clicksingInButton();
        System.out.println("clicked on signin Button");
        
         lg.closeanglePopUp();	
         Screenshot.screenshot(driver);
         
	}
	
	@AfterMethod()
    public void teartDown()
    {
	 driver.quit();
	 
	 System.out.println("Browser is Closed");
    }

}
