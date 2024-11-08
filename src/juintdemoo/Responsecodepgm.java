package juintdemoo;



import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException; 
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.junit.Test;

public class Responsecodepgm {
String link="https://www.google.com";//store cheythu stringlekk link
@Test
public void test() throws IOException
{

	URL ob = new URL(link);//create constructor of url
	HttpURLConnection con=(HttpURLConnection)ob.openConnection();//casting of url into https
	int code=con.getResponseCode();//response code getting code
	System.out.println("response code ="+code);
}
}

