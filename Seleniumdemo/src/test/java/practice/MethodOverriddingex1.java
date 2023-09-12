package practice;

class ParentClass {

	public void method1() {

		System.out.println("Hello");
	}

}

class childclass extends ParentClass {

	public void method1() {

		System.out.println("Hello2");
	}

}

public class MethodOverriddingex1 {

	public static void main(String[] args) {

		ParentClass obj = new ParentClass();

		obj.method1();
       
		childclass obj1 = new childclass();
		obj1.method1();
		
	}

}
