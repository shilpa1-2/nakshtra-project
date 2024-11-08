package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fblogintwo {
	WebDriver driver;
	By fbcreatepg=By.xpath("//*[@id=\"reg_pages_msg\"]/a");
	
	public Fblogintwo( WebDriver driver)
	{
	this.driver=driver;	
	}
	public void setvalues()
	{
		driver.findElement(fbcreatepg).click();
		
	}
	public void navigate()
	{
		driver.navigate().back();
	}
}
