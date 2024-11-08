package testng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Instadatadriven {
ChromeDriver driver;
@BeforeTest
public void Setup()
{
	driver=new ChromeDriver();
	driver.get("https://www.instagram.com/accounts/login/?hl=en");
}
@Test
public void test() throws Exception 
{
FileInputStream f=new FileInputStream("C:\\Users\\SHILP\\OneDrive\\Desktop\\Book2.xlsx");	
XSSFWorkbook wb=new XSSFWorkbook(f);
 XSSFSheet sh=wb.getSheet("sheet1");
int row= sh.getLastRowNum();
for(int i=1;i<=row;i++)
{
String username=sh.getRow(i).getCell(0).getStringCellValue();
String password=sh.getRow(i).getCell(1).getStringCellValue();
driver.findElement(By.name("username")).sendKeys(username);
driver.findElement(By.name("password")).sendKeys(password);
driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]")).click();
}
}
}
