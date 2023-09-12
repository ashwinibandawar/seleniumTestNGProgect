package compolymorphism;

public class MethodOverloading {
	
	//We can have same method Name with different parameters
	//Rules-
	//You can keep the count of different Parameters
	//you can keep different Datatypes--
	//Sequence of parameters should be different
	
	
	
   public void addition(int a,int b) {
		System.out.println(a+b);
			
   }	
   
	public void addition(double a,double b) {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		
		MethodOverloading obj=new MethodOverloading();
		
		obj.addition(5, 6);
		obj.addition(12.5, 10.5);
		
		
		
	}
	
	
	
	
	
   	
}

