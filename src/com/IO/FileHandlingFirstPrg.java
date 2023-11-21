package com.IO;

import java.io.*;

public class FileHandlingFirstPrg {
	void fileCreate() {
		try {
			File file = new File("second.txt");
			if (file.createNewFile()) {
				System.out.println("file is successfully created ");
			} else {
				System.out.println("file Already exist");

			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	void fileWriter() {
		// try with resources
		try (FileWriter writer = new FileWriter("second.txt", true)) {
			for (int i = 1; i < 5; i++) {
				writer.write("Rajesh Gajraj ");
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	void fileReader() {
		try (FileReader reader = new FileReader("second.txt")) {
            int ch;
			while ((ch=reader.read())!=-1)
				System.out.print((char)ch);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		FileHandlingFirstPrg fh = new FileHandlingFirstPrg();
		fh.fileCreate();
		// fh.fileWriter();
		fh.fileReader();
	}

}
