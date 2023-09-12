package TestNGAnnotations;

import org.testng.annotations.Test;

public class groupDemo {

	@Test
	public void method1() {
		System.out.println("hello");
	}

	@Test(groups = "Smoke")
	public void method2() {
		System.out.println("hello1");
	}

	@Test(groups = "Sanity")
	public void method3() {
		System.out.println("hello2");
	}
}
