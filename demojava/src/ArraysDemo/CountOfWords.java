package ArraysDemo;

public class CountOfWords {

	public static void main(String[] args) {
	
		
		String s = "Hello i love java";
		
		String ch[] = s.split(" ");
	
	System.out.println(ch.length);
	
	for(int i= 0; i<ch.length; i++) {
		System.out.println(ch[i].length());
	}
		
		String t[] = s.split(" ");
		
		for(int i=0; i<t.length; i++) {
		
		for (int j= t[i].length()-1;j>=0;j--) {
			
			System.out.print(t[i].charAt(j));
		}
	       System.out.print(" ");	
	       
	       
	      
	       
	}	
}
}