package cn.com.datastructure.base.code23;

public class TestClass {
	public static void main(String[] args) {
		Student stu1 = new Student();
		Student stu2 = new Student();
		stu1.name = "张三";
		stu1.play();

		stu2.name = "李四";
		stu2.play();


	}
}

class Student {
	//属性 成员变量
	String name;
	String sex;
	int age;

	//方法 函数
	public void play(){
		System.out.println(name + "可以游戏");
	}

	public void study(){
		System.out.println("可以学习");
	}
}