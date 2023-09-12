package Loops;

public class forInsidFor {

	//NastedForLoop
	
	
	public static void main(String[] args) {
		//0 1 2 3 4 5
		
		for(int i = 0; i <= 4; i++) {//outer for loop
			
			
		for (int j = 0; j <= i; j++ ) {//inner for loop
			System.out.print("*" + " ");	
		}//inner end
		
		System.out.println(); //This will shift control to next
		
		
		} //outer end
		
		
	
	for(int i = 0;i<=4;i++) {
		
	for(int j = 5;j>i;j--) {
		System.out.print("");
	}
		
	for(int j=0;j<=i;j++) {
		
		System.out.print("*");
	}
		System.out.println("");
		
			
		}	
			

			
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}	
	
}	
	

	
	
	
	
	
	
	


