package com.restassured.tests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetExample {

	
	
	@Test
	private void getMethod()
	{
		Response resp=RestAssured.get("http://localhost:3000/posts");	
		System.out.println("Status Code is : "+resp.getStatusCode());
		System.out.println(resp.getContentType());
		//System.out.println(resp.getHeader());
		System.out.println(resp.getBody());
		System.out.println(resp.toString());
	}
	
}
