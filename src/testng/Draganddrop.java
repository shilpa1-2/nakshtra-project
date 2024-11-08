package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Draganddrop {
	ChromeDriver driver;
	@BeforeTest
	public void Setup()
	{
	driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	}
@Test
public void test()
{
WebElement bank1=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"))	;////*[@id="credit2"]/a
WebElement source1=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));////*[@id="bank"]/li
Actions act=new Actions(driver);
act.dragAndDrop(bank1,source1).perform();
}
@Test
public void test1()
{
	
	WebElement bank2=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"))	;
	WebElement source2=driver.findElement(By.xpath("//*[@id=\"amt7\"]"));
	Actions act=new Actions(driver);
	act.dragAndDrop(bank2,source2).perform();
	}


@Test
public void test2()
{
WebElement sales=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"))	;
WebElement source3=driver.findElement(By.xpath("//*[@id=\"loan\"]"));
Actions act=new Actions(driver);
act.dragAndDrop(sales,source3).perform();
}
@Test
public void test3()
{
WebElement sales1=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"))	;
WebElement source4=driver.findElement(By.xpath("//*[@id=\"amt8\"]"));
Actions act=new Actions(driver);
act.dragAndDrop(sales1,source4).perform();
WebElement perfect=driver.findElement(By.xpath("//*[@id=\"equal\"]/a"));
boolean b=perfect.isEnabled();
if(b)
{
	System.out.println("perfect");
}
else
{
	System.out.println("not perfect");
}
}
}

