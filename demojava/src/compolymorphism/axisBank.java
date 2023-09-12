package compolymorphism;

public class axisBank extends bank {//child

	
	//Overided method
	public void rateOfinterest() {
		System.out.println("9%");
	}
	
	public void method2() {
		System.out.println("i am from axis bank");
	}
	
	
	
	public static void main(String[] args) {
		
		axisBank obj=new axisBank ();
		obj.rateOfinterest();
         obj.method1 ();		
		obj.method2();
		
		bank obj1=new bank();
		obj1.rateOfinterest();
		obj1.method1();
		
		bank obj2=new axisBank();
		obj.rateOfinterest();
		obj2.method1();
        		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
