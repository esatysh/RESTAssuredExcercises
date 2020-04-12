package com.restassured.tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class OAuth_Preemptive_Method2 extends BaseClass {

	@BeforeTest
	private void beforeTestMethod()
	{
		System.out.println("Before Test Method in the child class");
	}
	@Test
	private void authenticationMethod()
	{
		int statusCode=RestAssured.given().get("http://restapi.demoqa.com/authentication/CheckForAuthentication/").getStatusCode();
		System.out.println("Status Code is : "+statusCode);
	}
	
	
	
	
}
