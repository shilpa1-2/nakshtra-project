package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Demo {
@BeforeTest(alwaysRun=true)
public void befotest()

{
System.out.println("beforetest");	
}
@BeforeMethod(alwaysRun=true)
public void beforemethod()
{
System.out.println("beforemethod");	
}
@Test(priority=3)
public void test1()
{
	System.out.println("test1");
}

@Test(groups= {"sanity"})
public void test2()
{ 
	System.out.println("test2");
}
@Test(groups= {"smoke","sanity"})
public void test3()
{
	System.out.println("test3");
}
@Test(groups= {"sanity"})
public void test4()
{
	System.out.println("test4");
}

@AfterMethod
public void aftrmethod()
{
System.out.println("aftrmethod");
}
@AfterTest
public void aftertest()
{
System.out.println("aftrtest");	

}
}