package testNGPackage;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class TNG_06DataProvider {
	@Test(dataProvider="SupplyData")
	public void getData(String username,String password,String email,String city) {
		System.out.println(username+""+password+""+email+""+city);
	}
	
	
	@DataProvider
	public Object[][]SupplyData(){
		Object [][] data = new Object[3][4];
		
		// row 1
				data[0][0] = "Username";
				data[0][1] = "Password";
				data[0][2] = "Email";
				data[0][3] = "City";

				// row 2
				data[1][0] = "Pooja";
				data[1][1] = "Smart@123";
				data[1][2] = "Pooja@yopmail.com";
				data[1][3] = "Pune";

				// row 3
				data[2][0] = "Sachin";
				data[2][1] = "Smart@123";
				data[2][2] = "Sachin@yopmail.com";
				data[2][3] = "Hyderabad";

				return data;

		
	}
	
	
	
}