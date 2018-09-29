package cn.com.datastructure.base.code54;

import java.io.*;

public class TestIOException {
	public static void main(String[] args) {
		File file = new File("E:\\Javabymyself\\ibeifeng\\54");
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}