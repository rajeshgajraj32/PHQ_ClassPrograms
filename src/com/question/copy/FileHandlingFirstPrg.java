package com.question.copy;

import java.io.File;

public class FileHandlingFirstPrg {
	void fileCreate() {
		try {
			File file = new File("first.txt");
			if (file.createNewFile()) {
				System.out.println("file is successfully created ");
			} else {
				System.out.println("file Already exist");

			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		FileHandlingFirstPrg fh = new FileHandlingFirstPrg();
		fh.fileCreate();
	}

}
