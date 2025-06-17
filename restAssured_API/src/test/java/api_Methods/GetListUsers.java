package api_Methods;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetListUsers {
    @Test
	public void getAPI() {
		Response res = RestAssured.get("https://reqres.in/api/users?page=2");
		
		System.out.println(res.asPrettyString());
		System.out.println(res.statusCode());
		System.out.println(res.getHeader("Content-Type"));
		
	  int statuscode = 	res.getStatusCode();
	  Assert.assertEquals(statuscode,200,"Actual status code is not matched,please verify");
	}
	
	
	
}
