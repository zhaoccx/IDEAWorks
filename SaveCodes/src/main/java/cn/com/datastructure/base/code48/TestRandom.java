package cn.com.datastructure.base.code48;

import java.util.*;

public class TestRandom {
	public static void main(String[] args) {
		Random ran = new Random();
		double a = 1.0d;
		for(int i = 0; i < 100; i++) {
			a = ran.nextDouble();
			System.out.print(a + " ");
		}
	}
}