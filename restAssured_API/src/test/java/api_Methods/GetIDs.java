package api_Methods;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetIDs {
   
	@Test
	public void getIDs() {
		Response res = RestAssured.get("https://reqres.in/api/users?page=2");
		

		
		//System.out.println("Response as "+ res.asPrettyString());
		

		given().header("x-api-key","reqres-free-v1");
		
		
		//List<Integer> NoOfIlds = res.jsonPath().get("data.id");
		List<Integer> NoOfIlds= res.jsonPath().getList("data.id");
		for(Integer id:NoOfIlds) {
			
			System.out.println("Id's "+ id);
			
		}
		
	}
	
	
}
