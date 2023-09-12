package Loops;

public class whileloop {

	public static void main(String[] args) {
		
	//number iteration will not fix
	int a=0;
	
	while(a <= 100) {
		
		if(a % 2 == 0) {
		System.out.println(a+" even number");
		
	}
		else {
		System.out.println(a+" odd number");
		
	}
		a++;
	}
}
}