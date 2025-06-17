package httpMethodsBDD;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
public class Serialization_deSerialization_RestAssured {

	@Test
	public void serializationTest() throws JsonProcessingException {
		
		pojoData pdata = new pojoData();
		pdata.setName("Arun");
		pdata.setJob("Automation tester");
		
		ObjectMapper obj = new ObjectMapper();
		String jdata = obj.writerWithDefaultPrettyPrinter().writeValueAsString(pdata);
		System.out.println(jdata);
		
	}
	@Test
	public void deSerializationTest() throws JsonMappingException, JsonProcessingException {
		
		String jdata = "{\n"
				+ "	 \"name\" : \"Ketaki Rane\",\n"
				+ "	 \"job\" : \"Business Analyst\"\n"
				+ "}";
		
		ObjectMapper obj = new ObjectMapper();
		pojoData pdata = obj.readValue(jdata,pojoData.class);
		System.out.println(pdata.getName());
		System.out.println(pdata.getJob());
	}
	
	
	
}
