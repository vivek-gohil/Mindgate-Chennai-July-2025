package com.mindgate.main.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteReadWriteUtil {

	private File file;
	private InputStream inputStream;
	private OutputStream outputStream;
	private byte[] data;
	public ByteReadWriteUtil(File file) {
		try {
			this.file = file;
			inputStream = new FileInputStream(file);
			long fileSize = file.length();
			data = new byte[(int) fileSize];
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found!!");
			System.out.println(e.getMessage());
		}
	}
	public ByteReadWriteUtil(File file, String data) {
		try {
			this.file = file;
			outputStream = new FileOutputStream(file,true);
			this.data = data.getBytes();
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found!");
			System.out.println(e.getMessage());
		}
	}
	public void writeFile() {
		try {
			outputStream.write(data);
			System.out.println("Check your file!!");
		} catch (IOException e) {
			System.out.println("Failed to write");
			System.out.println(e.getMessage());
		} finally {
			if (outputStream != null) {
				try {
					outputStream.flush();
					outputStream.close();
					outputStream = null;
				} catch (IOException e) {
					System.out.println("Failed to flush/close");
					System.out.println(e.getMessage());
				}
			}
		}
	}

	public String readFile() {
		try {
			inputStream.read(data);
			String fileData = new String(data);
			return fileData;
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("finally() start");
			if (inputStream != null) {
				try {
					inputStream.close();
					inputStream = null;
				} catch (IOException e) {
					System.out.println("Failed to close InputStream");
				}
			}
			System.out.println("finally() end");
		}
		return "";
	}

}
