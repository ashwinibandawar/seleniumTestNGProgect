package TestNGAnnotations;

import org.testng.annotations.Test;

public class DifferentAnnotation {

	@Test
	public void method1() {
		System.out.println("hello 12");
	}
	@Test(invocationCount=10)
	public void method() {
		System.out.println("hello");
	}
}
