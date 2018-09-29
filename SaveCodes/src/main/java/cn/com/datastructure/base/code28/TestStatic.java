package cn.com.datastructure.base.code28;

public class TestStatic {
	public static void main(String[] args) {
		Person per = new Person();
		per.display();
	}
}

class Person {
	static int id;
	int age;

	public int getAge(){
		id = 12;
		display();
		return age;
	}

	public static void display() {
		System.out.println("显示");
	}
}