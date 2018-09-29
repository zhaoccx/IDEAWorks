package cn.com.datastructure.base.code49;

public class TestBoolean {
	public static void main(String[] args) {
		//Boolean bool = new Boolean("true");
		Boolean bool1 = Boolean.valueOf("true");
		Boolean bool2 = Boolean.valueOf("true");
		System.out.println(bool1 == bool2);
	}
}