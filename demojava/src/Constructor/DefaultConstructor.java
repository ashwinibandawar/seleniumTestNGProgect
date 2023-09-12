package Constructor;

public class DefaultConstructor {

	
	int a;
	int b;
	public  DefaultConstructor(int c, int d) {
		 
	a=c;
	b=d;
	System.out.println(a +" " +b);
	
	}
	public static void main(String[] args) {
		
		DefaultConstructor obj = new DefaultConstructor(20, 30);
	}
}
