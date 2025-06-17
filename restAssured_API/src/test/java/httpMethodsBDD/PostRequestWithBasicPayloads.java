package httpMethodsBDD;
import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;
public class PostRequestWithBasicPayloads {
	String post_req = "https://reqres.in/api/users";
	@Test
	public void postRequestWithasicPayloads() {
		
	Response res = given().header("x-api-key","reqres-free-v1")
		.body("{\\n\"\n"
				+ "	  + \"    \\\"name\\\": \\\"Rest Assured\\\",\\n\"\n"
				+ "	  + \"    \\\"job\\\": \\\"API Automation Architecture\\\"\\n\"\n"
				+ "	  + \"}").when().post(post_req);
		
		
		//validate status code
		Assert.assertEquals(res.getStatusCode(),201);
		System.out.println(res.getStatusCode());
		
		res.then().log().body();
	}
	@Test
	public void postRequestHashMapPayloads() {
		HashMap<String,Object> data = new  HashMap<String,Object>();
		
		data.put("name","Arun");
		data.put("Job","Automation Engineer");
		
		Response res = given().header("x-api-key","reqres-free-v1").contentType("application/json")
		.body(data)//this will do serialization in rest assured.
		.when().post(post_req);
		
		res.then().statusCode(201).log().body();
		
	}
	@Test
	public void postRequestWithPojoData() {
		
		pojoData pdata = new pojoData();
		pdata.setName("Arun");
		pdata.setJob("Automation Engineer");
		
		Response res = given().header("x-api-key","reqres-free-v1").contentType("application/json")
				.body(pdata)//this will do serialization in rest assured.
				.when().post(post_req);
				
				res.then().statusCode(201).log().body();
		
		
		
		
	}
	
}
