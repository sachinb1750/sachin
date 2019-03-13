import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Basics3CreateDelete {
	@Test
	public void restdemo() {
//	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI = "http://216.10.245.166";
		//Giving query parameter for POST req here
		given()
			.queryParam("Key", "qaclick123")
			.body("{"+
			    "\"location\":{"+
		        "\"lat\" : -38.383494,"+
		        "\"lng\" : 33.427362"+
		    "},"+
		    "\"accuracy\":50,"+
		    "\"name\":\"Frontline house\","+
		    "\"phone_number\":\"(+91) 983 893 3937\","+
		    "\"address\" : \"29, side layout, cohen 09\","+
		    "\"types\": [\"shoe park\",\"shop\"],"+
		    "\"website\" : \"http://google.com\","+
		    "\"language\" : \"French-IN\""+
		"}")
				.when()
					.get("/maps/api/place/add/json")
						.then()
							.assertThat()
								.statusCode(200).and()
								.contentType(ContentType.JSON).and()
								.body("status", equalTo("OK"));
		
		//Create a place and immediately delete once created
		//Now integrating both above requests
		
		//Create - then get id and then delete based on that
		
		
	}
}
