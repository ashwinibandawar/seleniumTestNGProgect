package Com.inteface;

public class demo2 implements demo{

	@Override
	public void method1() {
		System.out.println("Ashwini");
	}
	
	@Override
	public void method2() {
		System.out.println("Bandawar");
	}
	
	public static void main(String[] args) {
		
		demo2 obj=new demo2();
		obj.method1();
		obj.method2();
		
		
		
		
		
	}
		
	
	
	
}
