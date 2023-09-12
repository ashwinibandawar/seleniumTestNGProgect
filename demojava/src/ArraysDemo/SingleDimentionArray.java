package ArraysDemo;

import java.util.Arrays;

public class SingleDimentionArray {

	//to store multiple values in single variable of same data type
	
	//we can't add new value in array and we can't delete  any value from Array
	//Array Size is always fixed
	
	
	public static void main(String[] args) {
		
		//data type variable name[]={}
	
		
   //datatype VariableName[]={}
	
	//to declare the Arrays we have two ways
		int a[]= {10,20,30,40}; //first way
		
		System.out.println(a.length); //find out the length of array
		
        /*int b= a.length;
          
         System.out.println(b);*/
		
		// i want to access the value from arrays-
		System.out.println(a[2]);
		
		// i want to modify some value in array-
		
		a[1]=60;
		System.out.println(a[1]);
		
		
		//To print the Arrays we have 3 ways
		
	//First way
		System.out.println(Arrays.toString(a));	
		
		//second way--- using for loop
		
		for(int i=0;i<4;i++) {
			
			System.out.print(a[i]+" ");
		
			System.out.println(a[i]);
		}
		
		for(int i=0;i<=3;i++) {
			System.out.print(a[i]+" ");
		}
		//third way --using for each loop
		
		for(int k:a) {
			System.out.print(k+" ");
		}
		
		
		
		
		
		
		
	
		
		
		
		
		
		
	}
}
