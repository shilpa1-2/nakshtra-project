package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ebay {
	ChromeDriver driver;
	@BeforeTest
	public void Setup()
	{
	driver = new ChromeDriver();
	driver.get("https://www.ebay.com/");
	}
@Test
public void setup()
{
	
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//implicityly calling 
WebElement electronics=	driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]"));
WebElement smartphn =	driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a"));
Actions act=new Actions(driver);
act.moveToElement(electronics).perform();
smartphn.click();
}
}