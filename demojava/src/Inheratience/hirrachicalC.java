package Inheratience;

public class hirrachicalC extends hirrachicalA{

	public void method3() {
		System.out.println("i am from childC");
	}
	public static void main(String[] args) {
		
		hirrachicalC obj=new hirrachicalC();
		obj.method1();
		obj.method3();
		
		
		
	}
	
	
	
}
