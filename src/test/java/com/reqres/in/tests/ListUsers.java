package com.reqres.in.tests;
//Objective:
//List Users (Get)-
//Request URL: https://reqres.in/api/users?page=2
//Assert response is 200

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ListUsers {

	@Test
	private void listUsersTest()
	{
		String url="https://reqres.in/api/users?page=2";
		Response resp=RestAssured.get(url);
		int statusCode=resp.getStatusCode();
		Assert.assertEquals(statusCode, 200);
	}
	
	
}
