package Inheratience;

public class hirrachicalB extends hirrachicalA{

	public void method2() {
		System.out.println("i am from childB");
	}
	
	public static void main(String[] args) {
		
		hirrachicalB obj=new hirrachicalB();
		
		obj.method1();
		obj.method2();
		
		
		
		
	}
	
	
	
}
