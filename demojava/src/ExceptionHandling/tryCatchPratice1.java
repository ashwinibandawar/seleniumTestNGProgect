package ExceptionHandling;

public class tryCatchPratice1 {
public static void main(String[] args) {
	try {
		int a[]= {10,20,30,40};
		System.out.println(a[5]);
	}
	try {
		int b=5;
		int c=3;
		System.out.println(b-c);
	}
	catch(Exception e) {
		System.out.println("please try to acess value within the rang");
	}
	System.out.println("hello1");
}
}
