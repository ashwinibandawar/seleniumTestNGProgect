package ExceptionHandling;
//Arithmetic Exception
public class tryCatch2 {

	
	public static void main(String[] args) {
		
		try {
			int a=10;
			int b=a/0;
			System.out.println(b);
		}
		catch(Exception e) {
			
			System.out.println("please tryto access value within the range");
			System.out.println("hello");
		}
		System.out.println("hello1");
		
		
	}
}
