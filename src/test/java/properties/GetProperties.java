package properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class GetProperties 
{
	@Test
	public void getProperties() throws IOException
	{
		Properties prop =new Properties();
		String a=System.getProperty("user.dir");
		FileInputStream file=new FileInputStream(a+"/src/test/java/config.properties");
		
		 prop.load(file);
		 
		String b= prop.getProperty("browser");
		System.out.println(b);
		
		
	}

}
