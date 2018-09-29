package cn.com.datastructure.base.code49;

public class TestByte {
	public static void main(String[] args) {
		byte byteVar1 = 2;
		byte byteVar2 = 4;  		
		//Byte b = new Byte(byteVar);
		Byte b1 = Byte.valueOf(byteVar1);
		Byte b2 = Byte.valueOf(byteVar2);
		System.out.println(b1.equals(b2));
	}
}