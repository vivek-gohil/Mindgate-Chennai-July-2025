package com.mindgate.main;

import java.io.File;
import java.util.Scanner;

import com.mindgate.main.util.ByteReadWriteUtil;

public class OutputStreamWriteFile {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter File Path ");
		String path = scanner.nextLine();
		scanner.nextLine();
		System.out.println("Enter Data");
		String data = scanner.nextLine();

		File file = new File(path);
		ByteReadWriteUtil byteReadWriteUtil = new ByteReadWriteUtil(file, data);
		byteReadWriteUtil.writeFile();
		scanner.close();
	}
}
