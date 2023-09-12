package conditionblocking;

public class ifelsedemo {

	public static void main(String[] args) {
		

		
    
		
		
	

    	int price=160000;
	
		if(price>=200000) {
		    System.out.println("bikes"); 
		}	    
		else if(price<250000 && price>=200000) {
			System.out.println("top model");
		}
		else if(price<200000 && price>=150000) {
		System.out.println("Second base model");
		}
	
		else if(price<150000 && price>=100000) {
			System.out.println("base model");
		}
		
		else {
			System.out.println("vehical not available");
		}

		int age=60;
		
		if (age>=90) {
			System.out.println("youlder");
		}
		//60>90        60<=50
		if (age>100 && age<=90);
		System.out.println("child");
		//60>20        60<90
		if (age>90 && age<50);
		System.out.println("young");
		//60>70       60>=40
		if(age>50 && age<=40);
		System.out.println("old");
	    
		
		
		
		
		
	}

}
