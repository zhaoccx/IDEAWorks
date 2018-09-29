package cn.com.datastructure.base.code40;

public class TestSameClass {
	private int age;
	
	public static void main(String[] args) {
		TestSameClass tsc = new TestSameClass();
		tsc.age = 20;
		tsc.run();
	}
	
	private void run() {
		System.out.println("run, age = " + age);
	}
}