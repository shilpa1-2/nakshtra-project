package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crosssbrowser {
	WebDriver driver;
	@Parameters("browser")
	@Test
	public void setup(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
		driver =new ChromeDriver();
		
			
		}
	
		else if (browser.equalsIgnoreCase("edge"))
		{
		driver=new EdgeDriver();	
		}
		else 
		{
			driver= new FirefoxDriver();
		}
	}
	public void test() 
	{
		
	
		driver.get("https://www.google.com");
	}
}