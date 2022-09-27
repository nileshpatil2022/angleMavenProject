package extentReport;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport 
{
	private ExtentHtmlReporter report;
	private ExtentReports extent;
	private ExtentTest test;
	private WebDriver driver;
	@BeforeMethod
	public void setupMethod()
	{
		 report=new ExtentHtmlReporter("extent.html");
		
		 extent =new ExtentReports();
		
		 extent.attachReporter(report);
		
		
		
	}
	
	@Test
	public void logincheck()
	{
        test=extent.createTest("navigate to facebook page");
		
		test.log(Status.INFO, "test case starts");
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\LENOVO\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
			 driver =new ChromeDriver();
			 
			 driver.get("https://www.google.com/");
			 
			 test.pass("navigate to google page");
			 
			 
	WebElement search=driver.findElement(By.xpath("//input[@name='q']"));
	search.sendKeys("facebook"+Keys.ENTER);
	
	test.pass("navigate to facebook page");
		
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		
		test.pass("browser is closed");
		
		test.log(Status.INFO, "test case stop");
		
		extent.flush();
	}

}
