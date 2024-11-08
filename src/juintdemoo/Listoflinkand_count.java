package juintdemoo;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Listoflinkand_count {
ChromeDriver driver;
@Before
public void setup()
{
	driver=new ChromeDriver();
	
	driver.get("https://www.Google.com");	
}
@Test
public void test()
{
List <WebElement> li=driver.findElements(By.tagName("a"));
System.out.println("total links="+li.size());
for(WebElement ele:li)
{
String link=ele.getAttribute("href");	//fetchng links
String text=ele.getText();//fetchng texts
System.out.println(link+"--------"+text);
}
}
}
