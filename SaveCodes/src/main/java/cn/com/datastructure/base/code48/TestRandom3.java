package cn.com.datastructure.base.code48;

import java.util.*;

public class TestRandom3 {
	public static void main(String[] args) {
		Random ran = new Random(10);
		int a = 1;
		for(int i = 0; i < 5; i++) {
			a = ran.nextInt();
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.println("----------------------------------------");
		
		ran.setSeed(10);
		for(int i = 0; i < 5; i++) {
			a = ran.nextInt();
			System.out.print(a + " ");
		}
	}
}