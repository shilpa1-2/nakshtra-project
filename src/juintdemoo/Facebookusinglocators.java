package juintdemoo;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookusinglocators {
ChromeDriver driver;
@Before
public void setup()
{
	driver= new ChromeDriver();
driver.get("https://www.facebook.com");	
}
@Test
public void fblogin()
{
	driver.findElement(By.id("email")).sendKeys("shilpakb@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("shilpa@98");
	driver.findElement(By.name("login")).click();
}

}

