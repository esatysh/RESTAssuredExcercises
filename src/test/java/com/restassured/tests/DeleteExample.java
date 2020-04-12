package com.restassured.tests;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		RequestSpecification request=RestAssured.given();
		
		//JSONObject json=new JSONObject();
		
		Response resp=request.delete("http://localhost:3000/posts/36");
		
		System.out.println("Status Code is : "+resp.getStatusCode());
		
		
		
		
		
		
		
		
	}

}
