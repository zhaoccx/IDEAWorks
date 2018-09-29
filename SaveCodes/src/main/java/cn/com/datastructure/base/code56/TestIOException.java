package cn.com.datastructure.base.code56;

import java.io.*;

public class TestIOException {
	public static void main(String[] args){
		File file = new File("E:\\Javabymyself\\ibeifeng\\54");
		try{
			file.createNewFile();
			throw new IOException();
		} catch(Exception ex) {
			System.out.println("IO错误2");
		}
		finally {
			System.out.println("哈哈，我总是会执行的哦！");
		}
	}
}