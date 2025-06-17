package authenticationType;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;
public class BearerTokenAuthentication {
    @Test
	public void bearerTokenTest() {
		String btoken = "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";
		
		Response res = given().header("Authorization","Bearer "+btoken)
		.when().get("https://api.github.com/user/repos");
		
		res.then().log().all();
		
	}
	
	
}
