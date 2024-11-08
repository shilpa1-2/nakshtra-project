package seleniumjunit;

import org.openqa.selenium.chrome.ChromeDriver;

public class webdriverdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		ChromeDriver driver=new ChromeDriver();//used to open the  chrome browser
		driver.get("https://www.google.com");///used to load the url
driver.quit();
	}

}
//quit//close the  entire tab
//close close the curnt tab