package Constructor;

public class Demo {

	int a;
	int b;
	public Demo() {
		
		a=10;
		b=20;
		System.out.println(a+" "+b);
	}
	
	public Demo(int c,int d) {
		int k=c;
		int p=d;
		System.out.println(k+" "+p);
	}
	
	public static void main(String[] args) {
		Demo obj=new Demo();
		Demo obj2=new Demo(30,40);
				   
				
	}
	
	
	
}
