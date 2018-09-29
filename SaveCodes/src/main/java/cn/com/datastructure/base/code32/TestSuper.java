package cn.com.datastructure.base.code32;

public class TestSuper {
	public static void main(String[] args) {
		Teacher tea = new Teacher("张老师","男",20);
		tea.sleep();
	}
}

class Person {
	String name;
	String sex;
	int age;

	public  Person(){

	}

	public Person(String name, String sex, int age){
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	public void eat() {
		System.out.println(name + "吃饭");
	}

	public void sleep(){
		System.out.println("睡觉");
	}

}


class Teacher extends Person{

	public Teacher(String name, String sex, int age){
	}

	public void teach() {
		System.out.println("教书");
	}

	public void sleep(){
		super.sleep();
		System.out.println("在家睡觉");
	}

}
