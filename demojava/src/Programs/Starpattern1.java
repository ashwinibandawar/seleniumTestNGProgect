package Programs;

public class Starpattern1 {

	public static void main(String[] args) {

		for (int i = 0; i <= 4; i++) { // outer loop //0 1 2 3 4

			for (int j = 5; j > i; j--) {// inner loop 1
				System.out.print(" ");

			}

			for (int j = 0; j <= i; j++) { // inner loop 2
				System.out.print("*");
			}
			System.out.println();
		}

		for (int s = 0; s <= 3; s++) {
			for (int j = 4; j > s; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= s; j++) {
				System.out.print("*");
			}
			System.out.println();

		}

		for (int i = 0; i <= 4; i++){

		
		
		for (int j = 0; j <= i; j++){

			System.out.print("*" + " ");
		}
           System.out.println("");
	}
		
	for(int i = 0; i<=4;i++) {
		
		for(int j=4-i; j>1;j--) {
			System.out.print(" ");
		}
		for(int j=0; j<=i;j++) {
			System.out.print("*"+" ");
		}
		System.out.println("");
	}
		
	for(int i=4;i>=0;i--) {
		
		for(int j=0;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println("");
	}
		
		
		int n=4;
		for(int i=0;i<=4-1;i++) {
			
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=4-1-i;j++) {
				System.out.print("*" + " ");
			}
			System.out.println("");	
		}
		for (int i=4; i>=1;i--) {
			
          for(int j=4;j>i;j--) {
	        System.out.print(" ");
        }
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		int m=4;
		for(int i=0;i<=m;i++) {
			
		for(int j=0;j<=i;j++) {
			System.out.print("*"+" ");
		}
           System.out.println("");
		
		
	
		for(int a=n-1;a>=0;a--) {
			for(int j=0;j<=a-1;j++) {
				System.out.print("*"+" ");
			}
			System.out.println("");	
		}			
		int s=4;
			for(int k=1;k<=s;k++) {
				
				for(int j=k;j<n;j++) {
					System.out.print(" ");
				}
			
				for(int j=1;j<=k;j++) {
					System.out.print("*");
				}
				System.out.println("");
				
			}
			for(int k=s;k>=1;k--) {
				for(int j=k;j<=n;j++) {
					System.out.print(" ");
				}
				for(int j=1;j<=k-1;j++) {
					System.out.print("*");
				}
				System.out.println("");
				
	
			}
		
	}
	}
}
