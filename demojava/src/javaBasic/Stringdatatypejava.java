package javaBasic;

public class Stringdatatypejava {

	public static void main(String[] args) {
	
	
	String a="hello i love java";
	
     //convert to uppercase
	String afterconvertingtouppercase=a.toUpperCase();
    System.out.println(afterconvertingtouppercase);	
	
	// convert to Lowercase
	
	String b= a.toLowerCase();
	System.out.println(b);
	
	//Find out the length
	
	int p= a.length();
	System.out.println(p);
	//join the string 
	
	String t="hello";
	String j="java";
	System.out.println(t+" "+j);
	
      //concat method 
	String l=t.concat(" "+j);
	System.out.println(l);
	
	String n="Tata";
	String b1="train";
	System.out.println(n+" "+b1);
	
	String T=n.concat(" "+b1);
	System.out.println(T);
	
	//character at specific index
	
	System.out.println(a.charAt(5));
	
	//index at specific character
	System.out.println(a.lastIndexOf('e'));
	
	//equals, equal ignore case, contains--
	//equal
	
	String ad="fdf";
	String bd="dkjsd";
	
	System.out.println(ad.equals(bd));	
	
	//equals ignore case
	
	String as="fdf";
	String gh="dkjsd";
	
	System.out.println(as.equalsIgnoreCase(gh));
	
	//Contains
	
	String ms="fdf";
	String db="dkjsd";
	System.out.println(ms.contains(db));
	
	//escape character---(backwordslash=\)
	
	//hello i "love" java
	
	String ds="hello i \"love\" java";
	
	System.out.println(ds);
	
	//i love \\backslash character- output
	
	String jk="i love \\\\backslash character";
	System.out.println(jk);		
			
	//trim-
	
	String x=" hello java ";
	System.out.println(x.trim());
	
	//Replace All
	String Z="hello java i love java";
	System.out.println(Z.replace("hello", "hold"));
	System.out.println(Z.replace(" ", "hold"));
	System.out.println(Z.replaceAll(" ",""));
			
			
	
	//Substring
	String k="hello i love java";
	
	System.out.println(k.substring(1));
	
	
	//endIndex is always (-1)
	System.out.println(k.substring(1,9));//begning and end index
	
	
	
	}
}
			
		 

	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
