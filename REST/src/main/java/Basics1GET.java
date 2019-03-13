import io.restassured.RestAssured;

import io.restassured.http.ContentType;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

public class Basics1GET {
	//Base, Resource, Parameter in GET URL
	//Parameter - Path Parameter, Query Parameter (GET Request)
	//Header Parameter
	//In Post , no parameter except key if not sending anything
	
	@Test
	public void restdemo() {
//	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI = "https://maps.googleapis.com";

		given()
				.param("location", "-33.8670522,151.1957362")
				.param("radius", "1500")
				.param("type", "restaurant")
				.param("keyword", "cruise")
				.param("Key", "AIzaSyBWL63rb9EZl9lEP-TUfqUHeKGPjbFeBpQ")
					.when().get("/maps/api/place/nearbysearch/json")
						.then()
							.assertThat()
								.statusCode(200)
								.contentType(ContentType.JSON).and()
//								.body("results[0].place_id", equalTo("ChIJi6C1MxquEmsR9-c-3O48ykI")).and()
								.header("Server", "scaffolding on HTTPServer2");
//		int statusCode = RestAssured.given().when().get("maps/api/place/nearbysearch").getStatusCode();
////		int statusCode = RestAssured.given().when().get().getStatusCode();
//		String statusLine = RestAssured.given().when().get().getStatusLine();
//		System.out.println(statusCode);
//		System.out.println(statusLine);

//		RestAssured.given().when().get().

//		
		// given().header("","")
		// cookie("","")
		// body("","")

		// given()
		// Request Headers
		// Parameters
		// Request Cookies

		// when()
		// get(response)
		// post(response)
		// put(resource)
		// then()
		// assertions to make sure we are getting correct response

		// extract()

	}

}
