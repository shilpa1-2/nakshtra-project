package testng;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileuploadusingrobotclas {
 ChromeDriver driver;

	@BeforeTest
	public void setup()
	{
	driver=new ChromeDriver();
	
	driver.get("https://www.ilovepdf.com/word_to_pdf");
	}
	@Test
	public void test1() throws Exception
	{
	driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click(); 
	fileUpload("C:\\Users\\SHILP\\Downloads\\Silpa kb Resume.docx");//method and path of file
	
	}
	public void fileUpload (String p) throws AWTException
	{ 
		StringSelection strSelection = new StringSelection(p);//object of string created
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents (strSelection, null);
	Robot robot = new Robot();//robot class to windows based pop up manage
	robot.delay(3000);//waiting time
	robot.keyPress (KeyEvent.VK_CONTROL);
	robot.keyPress (KeyEvent.VK_V);
	robot.keyRelease (KeyEvent.VK_V);
	robot.keyRelease (KeyEvent. VK_CONTROL);
	robot.keyPress (KeyEvent.VK_ENTER);
	robot.keyRelease (KeyEvent.VK_ENTER);
}
}