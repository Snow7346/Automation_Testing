package testNGPackage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TNG_09Assertions {
	    @Test
        public void A() {
        	//System.out.println("A");
        	//Assert.assertTrue(4>=4);
        	//System.out.println("B");
        	//assertEquals("Arun","Arun");
            //System.out.println("C");
            //assertTrue(0>4);
            //System.out.println("D");
	    	
	    	SoftAssert sa = new SoftAssert();
			
			System.out.println("A");
			sa.assertTrue(4>=4);
			System.out.println("B");
			sa.assertEquals("Nitin", "Nitin");
			System.out.println("C");
			sa.assertTrue(0>4,"this is not valid condition");
			System.out.println("D");
			
			sa.assertAll();  // this function acts as bag, keep storing all exception and log into the report at the end.
        }
}
