package testng;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Roughwindowhandler {
WebDriver driver;
@BeforeTest
public void setup()
{
driver=new ChromeDriver();

}
@Test
public void test()
{
driver.get("https://demo.guru99.com/popup.php");
String parentwindow=driver.getWindowHandle();
driver.findElement(By.xpath("/html/body/p/a")).click();
Set<String> allwindohnls=driver.getWindowHandles();
for(String handles:allwindohnls)
	if (!handle.equalsIgnoreCase(parentwindow))
	{
	driver.switchTo().window (handle);
	driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("anbc@gmail.com");
	driver.close();
	}
	driver.switchTo().window(parentwindow);


	}
	}
	
