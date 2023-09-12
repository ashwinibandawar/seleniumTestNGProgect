package javaBasic;

public class OperatorsDemo {

	//Arithematic, assignment,  comparsion, logical operator
	
	//Arithematic operators +, -, *, /, %, ++, -- 
	
	public static void main(String[] args) {
	
   int a=10;
   int b=20;
     System.out.println(a+b);
    
   int d=50;
   int e=30;
	System.out.println(d-e);
	
	int y=63;
	int z=7;
     System.out.println(y*z);
     
     int i=42;
     int k=6;
     System.out.println(i/k);
     
    int j=30;
    int n=8;
    System.out.println(j%n);
    
    //Assignment operator
    
    int m=9;
    System.out.println(++m);  //preincrement//10
    
	int v=7;
	System.out.println(v);  //postincrement//7
	
	int u=3;
	System.out.println(--u);  //predecrement//2
	
	int r=8;
	System.out.println(r);  //postdecrement//8
	
	
	//Comparison-- (>,<,>=,<=,!=,==)
	
	int q=20;
	int w=10;
	
	System.out.println(q>w); 
	System.out.println(q<w);
	System.out.println(q>=w);
	System.out.println(q<=w);
	System.out.println(q!=w);
	System.out.println(q==w);
	
	//logical operator-- (&&, ||, !)
	
	int x=30;
	
	System.out.println(x>30 && x<10);
	System.out.println(x>30 || x<10);
	System.out.println(!(x>20 || x>10));	
	
	
	
	
	
	
	
	
	
	
	}	
}
