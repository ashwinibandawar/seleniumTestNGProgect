package conditionblocking;

public class ifelsedemo1 {
public static void main(String[] args) {
	

	
	int price=600;
	if(price>=1000) {
		
	System.out.println("highest quality");
	}
	
	else if(price>=600 && price<1000) {
	System.out.println("high Quality");
	}

	else if(price<500 && price>600) {
		System.out.println("Medium Quality");
	}
	
	else {
		System.out.println("Low Quality");
	}
	
	int prise=500;
	if(prise>=2000) {
		
		System.out.println("Very Poor quality");
		
	}
	
	else if(prise>800 && prise<2000) {
		System.out.println("poor Quality");
	}
		
	else {
		System.out.println("low quality");
	}
		
		
		
		
	
	
	
	
	
}
}
