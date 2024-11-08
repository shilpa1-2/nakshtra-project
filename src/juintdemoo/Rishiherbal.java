package juintdemoo;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rishiherbal {
ChromeDriver driver;
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://rishiherbalindia.linker.store/");
}
@Test
public void test()
{
	String actualtitle=driver.getTitle();
	String expecttile="Rishiherbal";
	if(actualtitle.equals(expecttile)) 
	{
		System.out.println("verfied");
	
		}
	else
	{
		System.out.println("not verified heading");
	}
}
@Test
public void linkcount()
{
List<WebElement>li=	driver.findElements(By.tagName("div"));
System.out.println("links total count="+li.size());
}
@Test
public void text()
{
String src= driver.getPageSource()	;
if(src.contains("help"))
{
	System.out.println("the text is presented");
}
else
{
	System.out.println("text is not presented");
}
}
}
