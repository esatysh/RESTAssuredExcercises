package com.restassured.tests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class OAuth_Preemptive_Method1 {

	@Test
	private void authenticationMethod()
	{
		int statusCode=RestAssured.given().auth().basic("ToolsQA", "TestPassword").when().get("http://restapi.demoqa.com/authentication/CheckForAuthentication/").getStatusCode();
		System.out.println("Status Code is : "+statusCode);
	}
	
	
	
	
}
