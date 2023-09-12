package Collections;
import java.util.HashMap;

public class hashMapDemo {
public static void main(String[] args) {
	
	HashMap<String,Integer> obj=new HashMap<String,Integer>();
	
	obj.put("MH", 1);
	obj.put("raj",2);
	obj.put("mp", 3);
	obj.put("kr", 4);
	obj.put("kr", 5);
	
	System.out.println(obj);
	System.out.println(obj.containsKey("MH"));
	System.out.println(obj.size());
	
	//i want to access the value for specific key--
	System.out.println(obj.get("raj"));
	
	//i want to access the on only keys--
	for(String l:obj.keySet()) {
	System.out.println(l);
	}
	
	//i want to access the only keys--
	for(int p:obj.values()) {
	System.out.println(p);	
	}
	
	//i want to access the value and keys both
	for(String k:obj.keySet()) {
		System.out.println(k+ " " +obj.get(k));
	}
	
	
	
	//remove
	obj.remove("raj");
	System.out.println(obj);

	
	
}
}
