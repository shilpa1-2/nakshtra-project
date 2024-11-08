package juintdemoo;



import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
ChromeDriver driver;
@Before
public void setup()
{
	driver= new ChromeDriver();
	driver.get("https://www.facebook.com");
}
@Test
public void test() throws IOException
{
//File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//FileHandler.copy(src,new File("C://googlescreenshot.png"));
WebElement button=driver.findElement(By.name("login"));
File src1=((TakesScreenshot)button).getScreenshotAs(OutputType.FILE);
FileHandler.copy(src1, new File("./screenshot/buttonscreenshot.png"));
}
}
