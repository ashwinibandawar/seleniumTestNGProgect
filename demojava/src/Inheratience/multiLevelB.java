package Inheratience;

public class multiLevelB extends multiLevelA {

	
	public void method2() {
		System.out.println("i am from parent");
	}
	
	public static void main(String[] args) {
		
	multiLevelB obj=new multiLevelB();	
		
		obj.method2();
		obj.method1();
	}
	
	
	
	
}
