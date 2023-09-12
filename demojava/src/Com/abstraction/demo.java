package Com.abstraction;

public class demo extends AbstractClassDemo {

	void method2() {
		System.out.println("hello");
	}
	
	@Override
	void method3() {
		
	}
	
	public static void main(String[] args) {
		
		demo obj=new demo();
		obj.method1();
		obj.method2();
		
		
		
		
	}
	
	
	
	
	
	
}
