package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Realesttatepg {
WebDriver driver;
By estatelogin=By.xpath("/html/body/header/div[1]/div/a[1]");
By newuser=By.xpath("/html/body/div[3]/div/div/div/div[2]/div[2]/a");
By name=By.xpath("//*[@id=\"utitle\"]");
By email=By.xpath("//*[@id=\"umail\"]");
By passwd=By.xpath("//*[@id=\"memberpass\"]");
By cnfrmpaswd=By.xpath("//*[@id=\"repass\"]");
By phn=By.xpath("//*[@id=\"umobile\"]");
By createac=By.xpath("//*[@id=\"sub_regbutton\"]");
By usrname=By.xpath("//*[@id=\"ulogin\"]");
By password=By.xpath("//*[@id=\"upass\"]");
By login=By.xpath("//*[@id=\"sub_logbtn\"]");
public Realesttatepg(WebDriver driver)
{
this.driver=driver;	
}
public void setup()
{
	driver.findElement(estatelogin).click();
    driver.findElement(newuser).click();
}
public void setvalues(String usrname,String mail,String paswd,String confrmpaswd,String phone)
{
	driver.findElement(name).sendKeys(usrname);
	driver.findElement(email).sendKeys(mail);
	driver.findElement(passwd).sendKeys(paswd);
	driver.findElement(cnfrmpaswd).sendKeys(confrmpaswd);
	driver.findElement(phn).sendKeys(phone);
}
public void click()
{
	driver.findElement(createac).click();
}

public void userlogin(String username,String pwd)
{
	driver.findElement(usrname).sendKeys(username);
	driver.findElement(password).sendKeys(pwd);
}
public void login()
{
	driver.findElement(login).click();
}
}