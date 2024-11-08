package juintdemoo;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
ChromeDriver driver;
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");

}
@Test
public void test()
{
	WebElement testDropDown = driver.findElement(By.id("metric_iframe"));  
	Select dropdown = new Select(testDropDown); 
}
}
