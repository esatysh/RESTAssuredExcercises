package com.reqres.in.tests;


import java.util.Iterator;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

//Single User (Get)
//Request URL: https://reqres.in/api/users/2
//Assert response is 200 and also the response contains the first_name="Janet" 

public class GetSingleUser {

	@Test
	private void getSingleUser()
	{
		Response resp=RestAssured.get("https://reqres.in/api/users/2");
		int statusCode=resp.getStatusCode();
		Assert.assertEquals(statusCode, 200);
		
		String respBody=resp.getBody().jsonPath().prettify();
		System.out.println(respBody);
		JsonPath json=resp.jsonPath();

		String first_name=json.get("data.first_name");
		System.out.println("FirstName is :"+json.get("data.first_name"));
		Assert.assertEquals("Janet", first_name);

		
		
		
        }
		
		
		//JSONObject jsonObj=(json.getJsonObject("data").
		//String first_name=json.get("first_name");
		//System.out.println(first_name);
//		Assert.assertEquals("Janet", first_name);
		
		
	}
	
	

