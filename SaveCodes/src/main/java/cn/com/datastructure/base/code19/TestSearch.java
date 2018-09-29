package cn.com.datastructure.base.code19;

import java.util.*;

public class TestSearch {
	public static void main(String[] args) {
		int[] arr = new int[]{45,78,12,1,23};
		Arrays.sort(arr);
		System.out.println(Arrays.binarySearch(arr,0,2,23));
	}
}