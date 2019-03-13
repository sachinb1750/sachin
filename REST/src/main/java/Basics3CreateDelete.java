import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Basics3CreateDelete {
	@Test
	public void restdemo() {
//	public static void main(String[] args) {
		//Create a place and immediately delete once created
				//Now integrating both above requests
				
				//Create - then get id and then delete based on that
		String b = "{"+
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
		"}";
		
		// TODO Auto-generated method stub
		RestAssured.baseURI = "http://216.10.245.166";
		//Giving query parameter for POST req here
		Response res = given()
			.queryParam("Key", "qaclick123")
			.body(b)
				.when()
					.post("/maps/api/place/add/json")
						.then()
							.assertThat()
								.statusCode(200).and()
								.contentType(ContentType.JSON).and()
								.body("status", equalTo("OK")).and()
									.extract().response();
		
		System.out.println("\nCreating Data : \n"+b);
		System.out.println("\nCreate Data Response : \n"+res.asString());
		
		JsonPath js = new JsonPath(res.asString());
		System.out.println("\nGetting Place ID from Response : \n"+js.get("place_id").toString());
		
		//http://216.10.245.166/maps/api/place/delete/json?key=qaclick123
		Response res2 = given()
				.queryParam("key", "qaclick123")
				.body("{\"place_id\":\""+(js.get("place_id").toString())+"\"}")
				.when()
				.post("maps/api/place/delete/json")
					.then()
						.statusCode(200).and()
						.contentType(ContentType.JSON).and()
						.body("status", equalTo("OK")).and().extract().response();
		
		System.out.println("\nDelete Status : \n"+res2.asString());
		
	}
}
