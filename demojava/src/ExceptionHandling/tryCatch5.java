package ExceptionHandling;

public class tryCatch5 {
	public static void main(String[] args) {
    try {
	int a= 10/0;
}
    catch(ArrayIndexOutOfBoundsException e) {
    	
    	System.out.println("i am array out of bound");
    	
    }
    	
    catch (Exception e ) {
    	System.out.println("i am exception");
    }
    	System.out.println("hello1");   
}
}