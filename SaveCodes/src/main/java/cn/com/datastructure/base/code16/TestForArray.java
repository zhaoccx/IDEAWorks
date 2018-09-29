package cn.com.datastructure.base.code16;

public class TestForArray {
	public static void main(String[] args) {
		int[] arr = new int[]{121,45,78,65,23};
		
		for(int i = 0; i < arr.length; i+=2) {
			System.out.println(arr[i]);
		}
	}
}