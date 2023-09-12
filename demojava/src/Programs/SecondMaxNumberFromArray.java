package Programs;

import java.util.Arrays;

public class SecondMaxNumberFromArray {
	
	public static void main(String[] args) {
		
		int a[]= {10,40,70,20};
		
		int temp;
		for (int i=0;i<a.length;i++){ //outer for loop
		
			for(int j=i+1;j<a.length;j++) { //inner for loop
				if(a[i]<a[j]) {   
					temp=a[i];  
					a[i]=a[j];  
					a[j]=temp;  
					
				}
	}
		}
		System.out.println(a[1]);
		System.out.println(Arrays.toString(a));
		
		System.out.println("=========");
		
		int k[]= {10,30,80,20};
		
		int cool;
		
		for(int i=0;i<k.length;i++) {
		
			for(int j=i+1; j<k.length;j++) {
				
				if(a[i]<a[j]) {
		
					cool=a[i];
					a[i]=a[j];
					a[j]=cool;
				}
			}
		}	
				
			System.out.println(a[1]);
			System.out.println(Arrays.toString(a));
				
			
			
			
			
		
		
		
		
		
		
		
		
		
		}
}
