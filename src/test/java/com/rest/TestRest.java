package com.rest;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestRest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Response res = RestAssured.given().relaxedHTTPSValidation()
					.when().get("https://dummyjson.com/carts")
					.then().extract().response();
		String title = res.jsonPath().getString("carts[0].products[0].title");
		System.out.println("title is -"+title);
		
		
			
			Response res1 = RestAssured.given().relaxedHTTPSValidation()
			.when().get("https://dummyjson.com/products")
			.then().extract().response();
String image = res1.jsonPath().getString("products[0].images[0]");
System.out.println("image is -"+image);
	}

}
