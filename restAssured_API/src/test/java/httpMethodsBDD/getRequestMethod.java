package httpMethodsBDD;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class getRequestMethod {
	/* given() | - pre-condition  
	 * headers/ cookie/ path/query parameter/ playload(resources)/Authentication.
	 * 
	 * When()
	 * GET | POST| PUT| PATCH| DELETE
	 * 
	 * Then() - status code, message, json response, response payload(json path, format, time, /status MSG.)
	 * 
	 * log()
	 */ 
	
	
	
	@Test
	public void getRequestBDD() {
		given().when().get("https://reqres.in/api/users?page=2").then().statusCode(200)
		.body("page", equalTo(2))
		.body("data.id", hasItems(7,8,9,10,11,12))
		.body("data.id",contains(7,8,9,10,11,12))
		.body("data[0].first_name",equalTo("Michael"));
	}
}
