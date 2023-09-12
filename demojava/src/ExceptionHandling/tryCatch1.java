package ExceptionHandling;

public class tryCatch1 {

public static void main(String[] args) {
	
	
	try {
		int a[]= {10,20,30,40,50};
		System.out.println(a[5]);
	}
	
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("please try to access value within the range");
		System.out.println("hello");
	}
	
	System.out.println("hello1");
	
}
	
	
	
}
	

