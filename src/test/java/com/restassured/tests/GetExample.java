package com.restassured.tests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class GetExample {

	
	
	@Test
	private void getMethod()
	{
		Response resp=RestAssured.get("http://localhost:3000/posts");	
		System.out.println("Status Code is : "+resp.getStatusCode());
		System.out.println(resp.getContentType());
		//System.out.println(resp.getHeader());
		System.out.println("Body is : "+resp.getBody());
		System.out.println(resp.toString());
		/*JsonPath jsonpath=resp.jsonPath();
		jsonpath.get()*/
	}
	
}
