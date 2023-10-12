package TestNG_Group;

import org.testng.annotations.Test;

public class Sample2 {
	@Test(groups="smoke")
	public void demo4() {
	System.out.println("Hi demo4");	
	}
	
	@Test
	public void demo5() {
	System.out.println("Hi demo5");	
	}
	
	@Test(groups="smoke")
	public void demo6() {
	System.out.println("Hi demo6");	
	}
}
