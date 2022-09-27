package mavenAngleOne.UtilityPack;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot 
{
	WebDriver driver;
	
	public static void screenshot(WebDriver driver) throws IOException
	{
		Date d=new Date();
		
		SimpleDateFormat d1=new SimpleDateFormat("dd-MM-yy&hh:mm:ss");
		
		String time=   d1.format(d);
		 
	    String timestag=time.replace("-", "").replace("&", "").replace(":", "");
		 
	    TakesScreenshot gs=(TakesScreenshot)  driver; 
	    
	   File file= gs.getScreenshotAs(OutputType.FILE);
	   
	   File location =new File("./ScreenshotFolder/image"+timestag+".jpg");
		
	   FileHandler.copy(file, location);
	}

}
