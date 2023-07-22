package API;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;																					
import static org.hamcrest.Matchers.*;

import files.payload;

public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Validate if Add Place API is working fine//
		
		//given - all inputs details
		//when -submit the API
		//Then - validate the response
		
		RestAssured.baseURI= "http://rahulshettyacademy.com";
		given().log().all().queryParam("key", "qaclick123").header("content-Type","application/json")
		.body(payload.addPlace()).when().post("maps/api/place/add/json")
		.then().log().all().assertThat().statusCode(200).body("scope", equalTo("APP"));

	}

}
