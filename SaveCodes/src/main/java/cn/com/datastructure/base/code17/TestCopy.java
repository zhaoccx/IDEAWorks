package cn.com.datastructure.base.code17;

public class TestCopy {
	public static void main(String[] args) {
		int[] arr = new int[]{1,2,3,4,5,6};
		int[] copyArr = arr;
		copyArr[0] = 45;
		System.out.println(arr[0]);
	}
}