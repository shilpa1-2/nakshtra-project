package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Copypaste {
ChromeDriver driver;
@BeforeTest
public void Setup()
{
driver = new ChromeDriver();
driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
}
@Test
public void cp()
{
WebElement fullname=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));	
WebElement reddifid=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]"));
fullname.sendKeys("shilpakb");
Actions act=new Actions(driver);
act.keyDown(fullname,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
act.keyDown(fullname,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
act.keyDown(reddifid,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
act.perform();

}
}
