package testng;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Rough {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");	
	}
	
	@Test
	public void datadriven() throws Exception 
	{
		FileInputStream f=new FileInputStream("C:\\Users\\96596\\Desktop\\Book1.xlsx");
		XSSFWorkbook wb =new XSSFWorkbook(f);
		XSSFSheet sh= wb.getSheet("Sheet1");
		int row=sh.getLastRowNum();
		for(int i=1;i<=row;i++)
		{
			String username=sh.getRow(i).getCell(0).getStringCellValue();
			String pswd=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("Username:"+username +"-----Password:"+pswd);
			driver.findElement(By.name("email")).clear();
			driver.findElement(By.name("email")).sendKeys(username);
			driver.findElement(By.name("pass")).clear();
			driver.findElement(By.name("pass")).sendKeys(pswd);
			driver.findElement(By.name("login")).click();
			String expurl="https://www.facebook.com/home";
			String actualurl=driver.getCurrentUrl();
			if(expurl.equals(actualurl))
			{
				System.out.println("login successfull");
			}
			else
			{
				System.out.println("login failled");
			}
		}
		wb.close();
}
}