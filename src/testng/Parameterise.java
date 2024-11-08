package testng;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


	public class Parameterise {
		@Parameters("v")
	@Test
	public void test(String v)
	{
			System.out.println(v);
	}
	}


