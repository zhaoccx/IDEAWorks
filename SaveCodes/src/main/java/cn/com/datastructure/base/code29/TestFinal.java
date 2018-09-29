package cn.com.datastructure.base.code29;

public class TestFinal {
	public static void main(String[] args) {
		MyMath mm = new MyMath(3.14);
		mm.display();
	}
}

class MyMath {
	final double PI;
	
	public MyMath(double pi){
		PI = pi;
	}
	
	public void display(){
		System.out.println(PI);
	}
}