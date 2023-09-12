package TestNGAnnotations;

import org.testng.annotations.Test;

public class dependsOnDemo {

	@Test
	public void method1() {
		System.out.println("hello");
	}
	
	@Test(dependsOnMethods="method3")
	public void method2() {
		System.out.println("hello1");
	}
	
	@Test
	public void method3() {
		System.out.print("hello2");
	}
	
	@Test(dependsOnMethods="method1")
	public void method4() {
		System.out.println("hello4");
	}
	
	
}
