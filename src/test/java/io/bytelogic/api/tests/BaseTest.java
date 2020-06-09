package io.bytelogic.api.tests;

import org.testng.annotations.BeforeMethod;


import io.bytelogic.api.common.Resources;
import io.restassured.RestAssured;

public class BaseTest {

	public String apiKey;
	public static final String CODE = "us";
	public static final String USA = "United States of America";
	public static final String REG = "New Jersey";
	public static final String EXP_CODE = "code[0]";
	public static final String EXP_NAME = "name[0]";
	
	@BeforeMethod(alwaysRun = true)
	public void setUp() {
		RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
		apiKey = Resources.getAPIKey();
	}
}
