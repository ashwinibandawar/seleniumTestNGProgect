package Inheratience;

public class multiLevelC extends multiLevelB{

	public void method3() {
		System.out.println("i am child");
	}
	
	public static void main(String[] args) {
		multiLevelC obj=new multiLevelC();
		
		obj.method3();
		obj.method2();
		obj.method1();
		
		
	}
	
	
	
}
