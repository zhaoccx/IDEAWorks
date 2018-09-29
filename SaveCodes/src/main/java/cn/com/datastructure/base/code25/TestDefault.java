package cn.com.datastructure.base.code25;

public class TestDefault {
	public static void main(String[] args) {
		Test test = new Test();
		test.display();	
	}
}

class Test {
	boolean booleanVar;
	byte byteVar;
	short shortVar;
	char charVar;
	int intVar;
	long longVar;
	float floatVar;
	double doubleVar;
	
	public void display() {
		System.out.println("booleanVar = " + booleanVar);
		System.out.println("byteVar = " + byteVar);
		System.out.println("shortVar = " + shortVar);
		System.out.println("charVar = " + charVar);
		System.out.println("intVar = " + intVar);
		System.out.println("longVar = " + longVar);
		System.out.println("floatVar = " + floatVar);
		System.out.println("doubleVar = " + doubleVar);
	}
	
	
}