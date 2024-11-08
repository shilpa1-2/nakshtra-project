package juintdemoo;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertdemo {
ChromeDriver driver;
@Before
public void setup()
{
	driver=new ChromeDriver();
			driver.get("file:///C:/Users/SHILP/OneDrive/Desktop/alert3.html");
}
@Test
public void test()
{
driver.findElement(By.xpath("/html/body/input[1]")).click();
Alert a=driver.switchTo().alert();
String alerttext=a.getText();
System.out.println(alerttext);
a.accept();
driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("shilpa");
driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("kb");
}
}
