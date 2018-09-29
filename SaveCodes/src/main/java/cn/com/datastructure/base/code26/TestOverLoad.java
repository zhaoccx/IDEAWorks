package cn.com.datastructure.base.code26;

public class TestOverLoad {
	public static void main(String[] args) {
		Person per = new Person();
		per.love();
		per.love("唱歌");
		per.love(23);
	}
}

class Person {

	public void love(){
		System.out.println("我喜欢");
	}

	public void love(String str){
		System.out.println("我喜欢" + str);
	}


	public void love(int ivar) {
		System.out.println("我喜欢" + ivar);
	}
}