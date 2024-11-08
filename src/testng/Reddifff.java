package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Reddifff {
	ChromeDriver driver;
	@BeforeTest
	public void Setup()
	{
	driver = new ChromeDriver();
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
@Test
public void  test()
{
WebElement logo=	driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img"));
boolean b=logo.isDisplayed();
if(b)
{
	System.out.println("logo is displayed");
}
else
{
	System.out.println("logo is not displayed");
}
}
@Test
public void radiobutton()
{
WebElement radiobutton=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]"));
boolean c=radiobutton.isSelected();
if(c)
{
	System.out.println("selected");
}
else
{
	System.out.println("not selected");
}
}
}
