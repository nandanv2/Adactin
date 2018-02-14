package comTestNGProject;


import org.testng.Assert;
import org.testng.annotations.Test;

public class Validationsw {
	
	@Test
	public void Test1() {
		
	String a= "Antony George";
    String b="Antony George";
    Assert.assertEquals(a,b);
      
	}
	
	@Test
	public void Test2() {
		String a= "Antony George";
	    String b="Antony GEORGE";
	    Assert.assertEquals(a,b);
		System.out.println("Happy Valentines Day");
		System.out.println("Antony");
}
} 
	
 


