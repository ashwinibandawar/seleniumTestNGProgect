package Collections;

import java.util.HashMap;

public class CountOfCharacterUsingHashMap {
public static void main(String[] args) {
	
	String s="abab";
	char ch[] = s.toCharArray(); 
	
	//ch[]={'a','a','b','c','c','c','d'}
	HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
	for (int i=0;i<ch.length;i++) {
		if(hm.containsKey(ch[i])) {
			hm.put(ch[i],hm.get(ch[i])+ 1);
			
		}else {
			hm.put(ch[i], 1);
			
		}
	    }
		
	System.out.println(hm);
	
	
	
	
}
}
