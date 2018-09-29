package cn.com.datastructure.base.code34;

import java.util.*;



public class TestCount {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入长方形的长");
		double chang = in.nextDouble();
		System.out.println("请输入长方形的宽");
		double kuan = in.nextDouble();
		ChangFangXing cfx = new ChangFangXing(chang,kuan);
		System.out.println("长方形的周长为" + cfx.zhouChang());
		System.out.println("长方形的面积为" + cfx.mianJi());
	}
}

class ChangFangXing {
	double chang;
	double kuan;

	public ChangFangXing(double chang,double kuan) {
		this.chang = chang;
		this.kuan = kuan;
	}

	public double zhouChang(){
		double zhouchang = chang * 2 + kuan * 2;
		return zhouchang;
	}

	public double mianJi() {
		double mianji = chang * kuan;
		return mianji;
	}

}