package practice;

public class StringDataType1 {

	public static void main(String[] args) {
		
		
		String a="hello i love java";
		
		//upper case
		String b=a.toUpperCase();
		System.out.println(b);	
		
		//lowercase
		String c=a.toLowerCase();
		System.out.println(c);
		
		//length
		int d=a.length();
		System.out.println(d);
		//join the string
		
		String e="Hello";
		String f="Ashwini";
		String g=e +" " +f;
		System.out.println(g);
		
		//concat method
		String i=e.concat(" "+f);
		System.out.println(i);
		System.out.println("hello"+i);
		
		//Character at the specific Index
		
		System.out.println(a.charAt(6));
		
		//index at the specific Character
		
		System.out.println(a.indexOf(a));
		
		
		//equal case
		String s="Hello Java World";
		String k="Hello Java";
		System.out.println(s.equals(k));
		
		//equalIgnoreCase
		
		System.out.println(s.equalsIgnoreCase(k));
		
		//contains method
		
		System.out.println(s.contains(k));
		
		
		//trim
		
		String h=" hello java ";
		System.out.println(h.trim());
		
		//replace
		String x="hello java i love java";
		System.out.println(x.replace("i "," A "));
		
		System.out.println(x.replaceAll(" java"," Ashwini"));
		
		
		
	}
}
