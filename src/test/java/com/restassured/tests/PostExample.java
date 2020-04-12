package com.restassured.tests;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostExample {

	@SuppressWarnings("unchecked")
	@Test
	private void postMethod()
	{
	RequestSpecification request=RestAssured.given();
	
	//A request to the server has header, body (which contains the put, get ) and then the POST happens
	
	//header
	request.header("Content-Type","application/json");
	
	//create a JSONObject to specify the data
	JSONObject json=new JSONObject();
	json.put("id", "36");
	json.put("title","Selenium Driver");
	json.put("author", "Sathish");
	
	
	//build the request body
	request.body(json.toString());
	
	
	//send request and handle the response
	Response response=request.post("http://localhost:3000/posts");
	
	int code=response.getStatusCode();
	System.out.println(code);
	
	
	
	}
	
}
