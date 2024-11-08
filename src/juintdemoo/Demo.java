package juintdemoo;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chromium.ChromiumDriver;

public class Demo {
	ChromeDriver driver;
@Before
public void setup()
{
driver=new ChromeDriver();	
driver.get("https://www.google.com");
}
@Test
public void titleverification()
{
	String actualtitle=driver.getTitle();
	String expcttilt="Google";
	if(actualtitle.equals(expcttilt))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
		}

	@Test
public void txtverificaton()
{
		String src=driver.getPageSource();
		if(src.contains("Gmail"))
		{
			System.out.println("text verified");
		}
		else
		{
			System.out.println("text not verified");
		}
			}
		
}


