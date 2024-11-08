package testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepicker {
	String url="https://www.trivago.com";
WebDriver driver;
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.get(url);
}
@Test()
public void datepick()
{
driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div/fieldset/button[1]")).click();

 
    // Select the date
    selectDate("September 2024", "24");
}

private void selectDate(String expMonth, String expDate) {
    while (true) {
        // Get the displayed month details
        WebElement monthDetails = driver.findElement(By.xpath("//*[@id='__next']/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/h3"));
        String month = monthDetails.getText();
        if (expMonth.equals(month)) {
            System.out.println(month);
            break;
        } else {
            // Click on the "Next" button to move to the next month
            driver.findElement(By.xpath("//*[@id='__next']/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/button[2]")).click();
        }
    }

    // Find all the dates and select the required one
    List<WebElement> dateList = driver.findElements(By.xpath("//*[@id='__next']/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button/time"));
    for (WebElement ele : dateList) {
        String date = ele.getText();
        if (date.equals(expDate)) {
            ele.click();
            break;
        }
    }
}
}


