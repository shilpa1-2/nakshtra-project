package testng;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DAtadriventest {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
	driver=new ChromeDriver(); 
	driver.get("https://www.facebook.com");
	}
	@Test
	public void datadriven() throws Exception
	{
	FileInputStream f=new FileInputStream("C:\\Users\\SHILP\\OneDrive\\Desktop\\Book1.xlsx");//creating fileintput object and adding path
	XSSFWorkbook wb=new XSSFWorkbook(f);//work book object created 
	XSSFSheet sh=wb.getSheet("Sheet1");//
	int row=sh.getLastRowNum();
	for(int i=1;i<=row;i++)
	{
	String username=sh.getRow(i).getCell(0).getStringCellValue();
	String pswd=sh.getRow(i).getCell(1).getStringCellValue();
	System.out.println(username+"----"+pswd);
	driver.findElement(By.name("email")).sendKeys (username);
	driver.findElement(By.name("pass")).sendKeys (pswd);
	driver.findElement(By.name("login")).click();
	String expectedurl="https://www.facebook.com/home";
	String actualurl=driver.getCurrentUrl();
	if(expectedurl.equals(actualurl))
	{
		System.out.println("login successfull");
	}
	else
	{
		System.out.println("login unsuccessfull");
	}
	}
	}
}
