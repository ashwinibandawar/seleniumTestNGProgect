package Collections;

import java.util.HashSet;

public class RemoveDublicatesFromString {
public static void main(String[] args) {
	
	String s="iLovejava";
	char ch[]=s.toCharArray();
	HashSet<Character>hs=new HashSet<Character>();
	//for each Loop
	for(char k:ch) {
		hs.add(k);
	}
	
	System.out.println(hs);
	
	
	//for Loop
	for(int i=0;i<ch.length;i++) {
		hs.add(ch[i]);
	}
	
	
	String d="aabbcc";
	
	char Ch[]=d.toCharArray();
	
	
	hs.put("aa","1");
	
	
	
	
}
}
