package Collections;

import java.util.ArrayList;

public class ArrayListDemo2 {
public static void main(String[] args) {
	
	ArrayList<String> obj=new ArrayList<String>();
	
	obj.add("20");
	obj.add("30");
	obj.add("40");
	obj.add("20");
	
	System.out.println(obj);
	System.out.println(obj.size());
	System.out.println(obj.get(3));
	
	//Add
	obj.add(1,"60");
	System.out.println(obj);
	
	//Replace
	
	obj.set(2, "50");
	System.out.println(obj);
	
	/*//Remove
	obj.remove(2);
	System.out.println(obj);
	
	//clear
	obj.clear();
	System.out.println(obj);*/
	
	//For Loop
	for(int i=0; i<obj.size(); i++) {
		System.out.println(obj.get(i));
	}
	
	//for each loop
	
	for(String a:obj) {
		System.out.println(a);
	}
	
	
	
	
	
	
	
	
	
	
}
}
