package Collections;

import java.util.HashSet;

public class HashSetDemo {
public static void main(String[] args) {
	
	HashSet<Integer> obj=new HashSet<Integer>();
	obj.add(10);
	obj.add(20);
	obj.add(30);
	obj.add(10);
	
	System.out.println(obj);
	obj.add(30);
	//obj.remove();
	for(int p:obj) {
		System.out.println(p);
	}
}
}
