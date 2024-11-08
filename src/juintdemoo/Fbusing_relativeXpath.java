package juintdemoo;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fbusing_relativeXpath {
ChromeDriver driver;
@Before
public void Setup()
{
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	
}
@Test
public void test()
{
driver.findElement(By.xpath("//input[@name='email']")).sendKeys("shilpakb@gmail.com");
driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("ajishilpa");
driver.findElement(By.xpath("//button[@name='login']")).click();
}
}
