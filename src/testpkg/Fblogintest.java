package testpkg;

//import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Fbloginpage;

public class Fblogintest {
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
Fbloginpage ob= new Fbloginpage(driver);
ob.setvalues("shilpakb@gmail.com", "sdsjdgysghgh");
ob.login();
}
}
