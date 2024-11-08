package seleniumjunit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Titleverification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.google.com");
String actualtitle=driver.getTitle();
String expcttilt="Google";
if(actualtitle.equals(expcttilt))
{
	System.out.println("pass");
}
else
{
	System.out.println("fail");
}
	}

}
