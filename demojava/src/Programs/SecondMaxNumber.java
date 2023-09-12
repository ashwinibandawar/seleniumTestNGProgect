package Programs;

import java.util.Arrays;

public class SecondMaxNumber {

public static void main(String[] args) {
	
	
	
	
	
   int k[]= {10,30,80,20};

    int cool;

for(int i=0;i<k.length;i++) {

	for(int j=i+1; j<k.length;j++) {
		
		if(k[i]<k[j]) {

			cool=k[i];
			k[i]=k[j];
			k[j]=cool;
		}
	}
}	
		
	System.out.println(k[1]);
	System.out.println(Arrays.toString(k));
		
	
	
}
}	


