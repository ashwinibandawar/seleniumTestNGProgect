package ArraysDemo;

import java.util.Arrays;

public class TwoDimentionArrays {

	public static void main(String[] args) {
		             //0th Array     1st Arrays
		int a[][]= {{10,20,30,40},{50,60,70,80}};
		
		System.out.println(a.length);//2
		
		System.out.println(a[0].length);//0th Array length//4
		
		System.out.println(a[1].length);//1st Arrays length //4
		
		System.out.println(a[0].length+a[1].length);  //Total length of 2 d arrays
		//Which array //Which index
		
		System.out.println(a[1][2]);//access the value from array-
		
		a[1][0]=32;  //modify the array
		
		System.out.println(a[1][0]);
		
		//print of the Arrays--
		
		System.out.println(Arrays.toString(a[0])+Arrays.toString(a[1]));
		
		
		//using for loop--
		
		System.out.println(a.length);//2
		
		System.out.println(a[0].length);//0tharray length 4
		
		System.out.println(a[1].length);//1st array length //4
		
		for(int i= 0; i< a.length;i++) {
			
			for (int j = 0; j < a[i].length;j++) {
				
				
				System.out.print(a[i][j]+" ");
			}
		    }
		
		//using for each loop
		for(int[] m:a) {
			System.out.println(Arrays.toString(m));		
			}
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
