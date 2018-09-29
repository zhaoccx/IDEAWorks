package cn.com.datastructure.base.code30;
public class TestInherit {
    public static void main(String[] args) {
        Teacher tea = new Teacher();
        tea.name = "李四";
        tea.eat();

        Student stu = new Student();
        stu.name = "张三";
        stu.eat();
    }
}

class Person {
    String name;
    String sex;
    int age;

    public void eat() {
        System.out.println(name + "吃饭");
    }
}


class Teacher extends Person{
    public void teach() {
        System.out.println("教书");
    }

}

class Student  extends Person {
    public void study() {
        System.out.println("学习");
    }
}