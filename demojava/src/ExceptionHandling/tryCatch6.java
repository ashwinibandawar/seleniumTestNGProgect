package ExceptionHandling;

public class tryCatch6 {
public static void main (String[] args) {
	
	
	try {
		int c[]= {10,20,30,40};
		System.out.println(c[5]);
	}
	catch(Exception e) {
		System.out.println("i am exception");
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("i am array out of bound");
	}
	System.out.println("hello1");
}
}
