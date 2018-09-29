package cn.com.datastructure.base.code55;

import java.io.*;

public class TestIOException {
	public static void main(String[] args) throws IOException {
		methoda();
	}
	
	public static void methoda()throws IOException {
		File file = new File("E:\\Javabymyself\\ibeifeng\\54");
		file.createNewFile();
	}
}