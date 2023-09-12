package TestNGAnnotations;

import org.testng.annotations.Test;

public class priorityDemo {

	@Test(priority=1)
	public void method1() {
		System.out.println("method1");
	}
	
	@Test(priority=0)
	public void method2() {
		System.out.println("method2");
	}
	
}
