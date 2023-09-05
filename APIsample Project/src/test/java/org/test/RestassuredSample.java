package org.test;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class RestassuredSample {
	@Test
	private void getRequest() {
		Response response = RestAssured.get("https://dummy.restapiexample.com/api/v1/employee/1");
		ResponseBody body = response.body();
		System.out.println(body.asPrettyString());

	}
}