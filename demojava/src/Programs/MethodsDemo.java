package Programs;

public class MethodsDemo {

	//non Static method
	
	public void Method1() {
		int a=10;
		System.out.println(a);
	}
	
	public static void method2() {
		System.out.println("hello2");
	}
	//method with int return type
	public int method3() {
		int a=5;
		return a;
	}
	//method with String return type
	public String method4() {
		String a="Ashwini";
		return a;
	}
	//non static void--
	public void method5() {
		int c=10+method3();
		System.out.println(c);
	}
	//paramterized method//parameters
	public static void method6(int a,int b) {
		System.out.println(a+" "+b);
		
	}
	public static void main(String[] args) {
		
		MethodsDemo obj=new MethodsDemo();
		
		obj.Method1();
		MethodsDemo.method2();
		obj.method4();
		
		
	}
	
	
	
	
	
	
}
