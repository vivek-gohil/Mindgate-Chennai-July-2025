package com.mindgate.main.util;

import java.io.File;
import java.util.Date;

public class FileMetadataUtil {
	public void printFileMetadata(File file) {
		if (file.exists()) {
			System.out.println("File Name :: " + file.getName());
			System.out.println("File Path :: " + file.getAbsolutePath());
			System.out.println("File Size :: " + file.length() + " bytes");
			System.out.println("Is File :: " + file.isFile());
			System.out.println("Is Folder :: " + file.isDirectory());
			System.out.println("Can Read :: " + file.canRead());
			System.out.println("Can Write :: " + file.canWrite());
			System.out.println("Can Execute :: " + file.canExecute());
			Date date = new Date(file.lastModified());
			System.out.println("Last Modified :: " + date);
		} else {
			System.out.println("File not found!!");
		}
	}
}
