package ExceptionHandling;

public class tryCatch3 {

	public static void main(String[] args ) {
		
		try {
			int a= 10;
			int b= a/0;
			System.out.println(b);		
			}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("i am array out of bound");
		}
		
		catch (ArithmeticException e) {
			System.out.println("i am arthmetic");
		}
		System.out.println("hello1");
		
		
	}
	
	
	
	
}
