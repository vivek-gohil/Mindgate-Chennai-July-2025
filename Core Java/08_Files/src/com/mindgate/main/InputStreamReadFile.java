package com.mindgate.main;

import java.io.File;

import com.mindgate.main.util.ByteReadWriteUtil;

public class InputStreamReadFile {

	public static void main(String[] args) {
		File file = new File("D:\\Vivek Gohil\\Training\\Mindgate-Chennai-July-2025\\MyFile.txt");
		ByteReadWriteUtil byteReadWriteUtil = new ByteReadWriteUtil(file);
		System.out.println(byteReadWriteUtil.readFile());
	}

}
