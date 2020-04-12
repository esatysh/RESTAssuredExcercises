package com.restassured.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import io.restassured.RestAssured;

public class BaseClass {

	@BeforeTest
		public void setup()
	{
		System.out.println("Before Test Method in the Base Class");
		RestAssured.authentication=RestAssured.preemptive().basic("ToolsQA", "TestPassword");
	}
	
	
}
