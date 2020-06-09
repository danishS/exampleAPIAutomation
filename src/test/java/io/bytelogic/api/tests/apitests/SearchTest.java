package io.bytelogic.api.tests.apitests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import io.bytelogic.api.common.Props.GroupProps;
import io.bytelogic.api.common.Resources;
import io.bytelogic.api.tests.BaseTest;
import io.bytelogic.api.util.HostNameUtil;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class SearchTest extends BaseTest{

	@Test(groups = GroupProps.FULL, description = "Tests search API using only country name as the search param")
	public void testCountrySearchAPI() {
		RestAssured.baseURI = HostNameUtil.getBattutaHostname();

		given()
		.queryParam("key", apiKey)
		.queryParam("country", USA)
		.contentType(ContentType.JSON)
		.when()
		.get(Resources.countrySearchResource())
		.then()
		.assertThat().statusCode(200)
		.and()
		.body(EXP_NAME, equalTo(USA))
		.and()
		.body(EXP_CODE, equalTo(CODE));
	}
	
	@Test(groups = GroupProps.FULL, description = "Tests search API using only region name as the search param")
	public void testRegionSearchAPI() {
		RestAssured.baseURI = HostNameUtil.getBattutaHostname();

		given()
		.queryParam("key", apiKey)
		.queryParam("region", REG)
		.contentType(ContentType.JSON)
		.when()
		.get(Resources.countrySearchResource())
		.then()
		.assertThat().statusCode(200)
		.and()
		.body(EXP_NAME, equalTo(USA))
		.and()
		.body(EXP_CODE, equalTo(CODE));
	}
}
