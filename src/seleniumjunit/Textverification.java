package seleniumjunit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Textverification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.google.com");
String src=driver.getPageSource();
if(src.contains("Gmail"))
{
	System.out.println("text verified");
}
else
{
	System.out.println("text not verified");
}
	}

}
