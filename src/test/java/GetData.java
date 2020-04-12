

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetData {

	
	@Test
	public void testResponseCode()
	{
		Response resp=RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
		int code=resp.getStatusCode();
		System.out.println("Response Status code is : "+code);
		
		Assert.assertEquals(200, code);
		
	}
	
	
	@Test
	public void testBody()
	{
		Response resp=RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
		String data=resp.asString();
		System.out.println("Response Status code is : "+data);
		
		//Assert.assertEquals(200, data);
		
	}
}
