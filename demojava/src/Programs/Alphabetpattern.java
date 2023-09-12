package Programs;

public class Alphabetpattern {

	public static void main(String[] args) {
		
		
		
	String str = "Globant";
	
		String temp = "";
		for(int i=0;i<str.length();i++) {
		temp = temp + str.charAt(i);
		System.out.println(temp);//Gl
		
		}
		
		int n=4;
		int alpha=65;
		
		for(int i=0;i<=n;i++) {
			
			for(int j=0;j<=i;j++) {
				System.out.print((char)(alpha+j)+" ");
			}
			System.out.println("");
			
			
		}
		
	
		
		int a=65;
		
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)(a+i)+" ");
			}
				System.out.println("");
		}	
			
			
			int d = 4;
			int l=65;
			
			for(int i=0;i<=d;i++) {
				
				for(int j=0;j<=i;j++) {
					System.out.print((char)(l++)+" ");
				}
				System.out.println("");
				
				
			}
			
		
		int k=65;
		
		for(int i=0;i<=4;i++) {
			for(int j=4;j>i;j--) {
				System.out.print(" ");
			}
			
			for(int j=0;j<=i;j++) {
				System.out.print((char)(k+j)+" ");
			}
			System.out.println("");
		}
		
	
		int x=65;
		for(int i=0;i<=n;i++) {
			
			for(int j=n;j>i;j--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print((char)(x+i)+" ");
			}
			System.out.println("");
			
		}
		
		
	
	int t=65;
	for(int i=0;i<=n;i++) {
		
		for(int j=n;j>i;j--) {
			System.out.print(" ");
			
		}
		for(int j=0;j<=i;j++) {
			System.out.print((char)(t++)+" ");
		}
		System.out.println("");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}	
}
