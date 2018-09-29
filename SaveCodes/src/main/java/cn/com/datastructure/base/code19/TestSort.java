package cn.com.datastructure.base.code19;

import java.util.*;

public class TestSort {
	public static void main(String[] args) {
		int[] arr = new int[]{45,78,12,1,23};
		Arrays.sort(arr,0,3);
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}
}