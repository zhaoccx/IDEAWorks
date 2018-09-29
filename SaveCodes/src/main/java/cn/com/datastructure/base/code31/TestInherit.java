package cn.com.datastructure.base.code31;

public class TestInherit {
	public static void main(String[] args) {
		Teacher tea = new Teacher();
		tea.sleep();

		Student stu = new Student();
		stu.sleep();
	}
}

class Person {
	String name;
	String sex;
	int age;

	public void eat() {
		System.out.println(name + "吃饭");
	}

	public void sleep(){
		System.out.println("睡觉");
	}

}


class Teacher extends Person{
	public void teach() {
		System.out.println("教书");
	}

	public void sleep(){
		System.out.println("在家睡觉");
	}

}

class Student  extends Person {
	public void study() {
		System.out.println("学习");
	}

	public void sleep(){
		System.out.println("在寝室睡觉");
	}
}
