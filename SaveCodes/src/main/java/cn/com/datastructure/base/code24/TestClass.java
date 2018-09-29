package cn.com.datastructure.base.code24;

public class TestClass {
	public static void main(String[] args) {
		Person per1 = new Person();
		per1.name = "张三";
		per1.sex = "男";
		per1.age = 20;
		per1.display();


		Person per2 = new Person();
		per2.name = "李四";
		per2.sex = "女";
		per2.age = 30;
		per2.display();

		Person per3 = new Person("王五","男",40);
		per3.display();
	}
}

class Person {
	//属性
	String name;
	String sex;
	int age;

	//默认构造方法
	public Person(){
	}

	//构造方法
	public Person(String uname, String usex, int uage) {
		name = uname;
		sex = usex;
		age = uage;
	}

	//方法
	public void display() {
		System.out.println("姓名:" + name + ",性别:" + sex + ",年龄:" + age);
	}

}