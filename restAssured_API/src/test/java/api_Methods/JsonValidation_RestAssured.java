package api_Methods;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


 

public class JsonValidation_RestAssured {
    @Test
	public void jsonValidationTest() {
		Response res = RestAssured.get("https://reqres.in/api/users?page=2");
		
		System.out.println(res.asPrettyString());
		
		int pageNo = res.jsonPath().get("page");
		
		Assert.assertEquals(pageNo,2,"pageNo is not correct");
		
		String firstname = res.jsonPath().get("data[1].first_name");
		Assert.assertEquals(firstname,"Lindsay","firstname is not matched");
		
		String supporttext = res.jsonPath().get("support.text");
		Assert.assertTrue(supporttext.contains("endess"),"Not matching");
		
		
	}
	
	
	
}
