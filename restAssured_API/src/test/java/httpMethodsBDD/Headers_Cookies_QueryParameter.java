package httpMethodsBDD;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;
public class Headers_Cookies_QueryParameter {

	String reqres_URL = "https://reqres.in/api/users?page=2";
	@Test
	public void headersTest() {
		
		given().header("x-api-key","reqres-free-v1").when().get(reqres_URL).then().log().all();
		
//		Response res = given().when().get(reqres_URL);
//		System.out.println(res.header("Content-Type"));
		
	}
	@Test
	public void queryParameterTest() {
		
		given().header("x-api-key","reqres-free-v1")
		.pathParam("path","users")
		.queryParam("page","2")
		.when().get("https://reqres.in/api/{path}")
		.then().statusCode(200).log().body();
		
	}
	@Test
	public void cookieTest() {
		
	   Response res =  given().when().get("https://google.co.in");
		System.out.println(res.getCookie("AEC"));
	    
	}
	
	
	
	
}
