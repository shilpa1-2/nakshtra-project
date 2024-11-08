package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import pagepkg.Fblogintwo;

public class Fbtwo {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void test()
	{
	Fblogintwo ob= new Fblogintwo(driver);
	ob.setvalues();
	ob.navigate();
	}
	}

