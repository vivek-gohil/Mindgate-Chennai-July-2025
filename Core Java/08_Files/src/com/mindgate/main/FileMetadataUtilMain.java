package com.mindgate.main;

import java.io.File;

import com.mindgate.main.util.FileMetadataUtil;

public class FileMetadataUtilMain {
	public static void main(String[] args) {
		File file = new File("D:\\Vivek Gohil\\Training\\Mindgate-Chennai-July-2025\\MyFile.txt");
		FileMetadataUtil fileMetadataUtil = new FileMetadataUtil();
		fileMetadataUtil.printFileMetadata(file);
	}
}
