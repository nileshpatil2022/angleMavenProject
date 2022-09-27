package properties;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class SetProperties 
{
	@Test
	public void setProperties() throws IOException
	{
		Properties prop=new Properties();
		
		String a=       System.getProperty("user.dir");
		
		FileOutputStream file=new FileOutputStream(a+"/src/test/java/properties/config01.properties");
		
		prop.setProperty("browser","chrome");
		
		prop.store(file, null);
	}

}
