package com.mindgate.main.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class CharReadWriteUtil {

	private File file;
	private Reader reader;
	private Writer writer;
	private char[] data;

	public CharReadWriteUtil(File file) {
		try {
			this.file = file;
			reader = new FileReader(file);
			long fileSize = file.length();
			data = new char[(int) fileSize];
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found!!");
			System.out.println(e.getMessage());
		}
	}

	public CharReadWriteUtil(File file, String data) {
		try {
			this.file = file;
			writer = new FileWriter(file, true);
			this.data = data.toCharArray();
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found!");
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println("FileIO Exception");
			System.out.println(e.getMessage());
		}
	}

	public void writeFile() {
		try {
			writer.write(data);
			System.out.println("Check your file!!");
		} catch (IOException e) {
			System.out.println("Failed to write");
			System.out.println(e.getMessage());
		} finally {
			if (writer != null) {
				try {
					writer.flush();
					writer.close();
					writer = null;
				} catch (IOException e) {
					System.out.println("Failed to flush/close");
					System.out.println(e.getMessage());
				}
			}
		}
	}

	public String readFile() {
		try {
			reader.read(data);
			String fileData = new String(data);
			return fileData;
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("finally() start");
			if (reader != null) {
				try {
					reader.close();
					reader = null;
				} catch (IOException e) {
					System.out.println("Failed to close InputStream");
				}
			}
			System.out.println("finally() end");
		}
		return "";
	}

}
