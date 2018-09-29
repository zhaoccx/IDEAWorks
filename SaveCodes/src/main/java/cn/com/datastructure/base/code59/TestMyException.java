package cn.com.datastructure.base.code59;

public class TestMyException {
	public static void main(String[] args) {
		try {
			throw new MyException();
		}catch(MyException ex) {
			ex.printStackTrace();
		}
	}
}