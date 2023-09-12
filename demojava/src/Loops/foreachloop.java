package Loops;

import java.util.Arrays;

public class foreachloop {
//enhance for loop--
	
	public static void main(String[] args) {
		
		
		
		int a[]= {20,30,40,50,60,70};
		
		System.out.println(a.length);
		
	//i want access the value of Arrays
		System.out.println(a[2]);
		
		//i want to modify some values in Arrays
		a[1]=32;
		System.out.println(a[1]);
		
		//To print Arrays we have 3 ways
		
		//First way
		System.out.println(Arrays.toString(a));
		
		//Second way using -- for loop
		
     for(int i=0;i<a.length;i++) {
    	 
    	 System.out.print(a[i]+" ");
     }
		
		System.out.println("");	
	//third way-- using for each loop	
     
     for(int k:a) {
    	 System.out.print(k+" ");
     }
     
     System.out.println("");
     
     String[]s= {"lord", "ganesh"};
     //Arrays.toString
     System.out.print(Arrays.toString(s));
     
     System.out.println();
     
     //for each loop
     
    for(String v:s) {
    	 System.out.print(v+" ");
     }
     
    System.out.println(); 
    
    //for loop
    for(int i=0;i<s.length; i++) {
    	System.out.print(s[i]+"");
    }
    
    
    
     
     
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
