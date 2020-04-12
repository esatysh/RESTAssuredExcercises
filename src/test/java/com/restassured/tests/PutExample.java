package com.restassured.tests;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class PutExample {

	
	@Test
	private void putMethod()
	{
		RequestSpecification request=RestAssured.given();
		
		JSONObject json=new JSONObject();
		
		request.header("Content-Type","application/json");
		
		json.put("id", "35");
		//json.put("author", "Sathish K E");
		json.put("title", "Selenium Driver 1");
		
		request.body(json.toString());
		
		Response resp=request.put("http://localhost:3000/posts/35");
		
		System.out.println(" Status Code is : "+resp.getStatusCode());
		
	}
}
