package io.bytelogic.api.tests.apitests;

import static io.restassured.RestAssured.given;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.bytelogic.api.common.Props.GroupProps;
import io.bytelogic.api.common.Constants;
import io.bytelogic.api.common.Resources;
import io.bytelogic.api.tests.BaseTest;
import io.bytelogic.api.util.HostNameUtil;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import static org.hamcrest.Matchers.equalTo;

public class CountriesTest extends BaseTest{

	@Test(groups = {GroupProps.FULL}, description = "Verify all country API"
			+ "returns a 200 and body is not empty")
	public void testAllCountriesAPI() {
		RestAssured.baseURI = HostNameUtil.getBattutaHostname();

		given().
		queryParam("key", apiKey)
		.contentType(ContentType.JSON)
		.when()
		.get(Resources.allCountryResource())
		.then()
		.assertThat().statusCode(200)
		.and()
		.body("isEmpty()", Matchers.is(false));
	}

	@Test(groups = {GroupProps.FULL}, description = "Verify passing a country code returns the correct response")
	public void testCountryCodeAPI() {
		RestAssured.baseURI = HostNameUtil.getBattutaHostname();

		given()
		.queryParam("key", apiKey)
		.contentType(ContentType.JSON)
		.when()
		.get(Resources.countryCodeResource().replace(Constants.REPLACER, CODE))
		.then()
		.assertThat().statusCode(200)
		.and()
		.body(EXP_NAME, equalTo(USA))
		.and()
		.body(EXP_CODE, equalTo(CODE));
	}

}
