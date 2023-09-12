package Programs;

public class Numberpattern {

	public static void main(String[] args) {
		
		
		
for (int i = 1; i<=5;i++) {
	
for(int j = 1;j <= i;j++) {
	System.out.print(j+"");
}
	System.out.println();
}	
	
for(int i= 1;i<=5;i++) {
	
	for(int j= 1; j<=i;j++) {
		System.out.print(i+" ");
	}
	System.out.println();	
}	
	
	
	int a=1;
	for(int i = 1;i<=5;i++) {
		for(int j=1; j<i+1; j++) {
			System.out.print(a++ +" ");
		}
		System.out.println();
	}	
		for(int i=4;i>=1;i--) {
			
			for(int j=4;j>=i; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
			
			int n=4;
		for (int i = n; i >= 1;i--) {
			
			for (int j=n;j>=i;j--) {
			System.out.print(i+" ");
			}	
			System.out.println();
			
		}
		
		for(int i = 1; i<=n;i++) {
			
			for(int j=i; j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}	
			
			int O =5;
		for(int i= 1;i<=O; i++) {
			
			for (int j=1;j<=i;j++) {
				if(j%2==0) {
					System.out.print(0);
		}
				
				else {
					System.out.print(1);
				}
			}
			
		System.out.println();	
			
			
			
		}
		
			
		
		
	
	

	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

}
