package ExceptionHandling;

public class tryCatch4 {

	public static void main(String[]args) {
		
		try {
			int a=10;
			int b= a/5;
			System.out.println(b);
			int c[]= {10,20,30,40};
			System.out.println(c[5]);
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("i am array out of bound");
		}
		
		catch(ArithmeticException e) {
			System.out.println("i am arthmetic");
		}
		System.out.println("hello1");
		
		
	}
}
