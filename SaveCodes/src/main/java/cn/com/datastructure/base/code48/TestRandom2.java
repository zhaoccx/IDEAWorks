package cn.com.datastructure.base.code48;

import java.util.*;

public class TestRandom2 {
	public static void main(String[] args) {
		Random ran = new Random();
		int a = 1;
		for(int i = 0; i < 100; i++) {
			a = ran.nextInt(10);
			System.out.print(a + " ");
		}
	}
}