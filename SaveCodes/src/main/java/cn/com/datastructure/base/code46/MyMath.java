package cn.com.datastructure.base.code46;

public class MyMath {
	
	public static int abs(int num1) {
		if(num1 >= 0) {
			return num1;
		} else {
			return -num1;
		}
	}
	
	
	public static double abs(double num1) {
		if(num1 >= 0) {
			return num1;
		} else {
			return -num1;
		}
	}
	
	public static int max(int num1,int num2) {
		return num1 > num2 ? num1 : num2;
	}
	
	public static int min(int num1,int num2) {
		return num1 < num2 ? num1 : num2;
	}
	
	public static long square(int num) {
		long result = num * num;
		return result;
	} 
	
	public static long cube(int num) {
		long result = num * num * num;
		return result;
	}
	
	public static long pow(int num1, int num2) {
		if(num2 == 0) {
			return 1;
		} else {
			long result = 1;
			for(int i = num2; i > 0; i--) {
				result *= num1;
			}
			return result;
		}
	}
	
	
}