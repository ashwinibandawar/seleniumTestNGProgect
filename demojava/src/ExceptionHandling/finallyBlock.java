package ExceptionHandling;

public class finallyBlock {
public static void main(String[]args) {
	
	try {
		int a[]= {10,20,30,40,50};
		System.out.println(a[5]);
	}
	catch(Exception e) {
		System.out.println("please try to access value within the range");
		System.out.println("hello");
	}
	//finally will execute always regardless of result-
	finally {
		System.out.println("hii");
	}
	System.out.println("after finally");
	
}
}
