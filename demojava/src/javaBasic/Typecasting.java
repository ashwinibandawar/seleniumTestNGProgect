package javaBasic;

public class Typecasting {

	public static void main(String[] args) {
		
		//widening
		
		int a=20;
		float f=a;
		System.out.println(f);
		
		short c=22;
		long l=c;
		System.out.println(l);
		
		short v=30;
		float f1=v;
		System.out.println(f1);
		
		int b=21;
		double k=b;
		System.out.println(k);
		
		//narrowing
		
		float z=10.0f;
		int n=(int)z;
		System.out.println(n);
		
		char ch='A';
		short aq=(short)ch;
		System.out.println(aq);
		
		double d=12.3;
		short v1=(short)d;
		System.out.println(v1);
		
		byte ax=67;
		char mn=(char)ax;
		System.out.println(mn);
		
		
		
		
		
		
		
	}
}
