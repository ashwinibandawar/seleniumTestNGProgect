package TestNGAnnotations;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationDemo {

	@Test
	@Parameters({"url","username"})
	public void Test1(String url , String username) {
		System.out.println(url + " " + username );
	}
}
