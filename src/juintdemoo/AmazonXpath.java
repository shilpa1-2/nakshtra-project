package juintdemoo;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonXpath {
	ChromeDriver driver;
	@Before
	public void Setup()
	{
		driver=new ChromeDriver();
		driver.get("https://amazon.in");
	}
	@Test
	public void text()
	{
		driver.findElement(By.xpath("//div[@id='nav-xshop']/a[6]")).click();
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//span[@id='nav-cart-count']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']")).click();
	}
	}




