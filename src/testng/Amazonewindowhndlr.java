package testng;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazonewindowhndlr {
WebDriver driver;
@BeforeTest
public void Setup()
{
driver =new ChromeDriver();

}
@Test
public void amzon()
{
driver.get("https://www.amazon.in");
driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobiles");
driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
}
@Test
public void title()
{
	String actualtitle=driver.getTitle();
	String expcttilt="Amazon.in:mobilephones";
	if(actualtitle.equals(expcttilt))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
		}

		


@Test
public void phone()
{
	driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
	
	String parentWindow=driver.getWindowHandle();
	
	
	Set<String> allWindowHandles= driver.getWindowHandles();
	for (String handle: allWindowHandles)
	{
	if (!handle.equalsIgnoreCase(parentWindow))
	{
	driver.switchTo().window (handle);
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0, 1000)");
	driver.findElement(By.xpath("/html/body/div[2]/div/div[5]/div[3]/div[1]/div[4]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[38]/div[1]/span/span/span/input")).click();
	driver.close();
	}
	driver.switchTo().window(parentWindow);


	}
}
}