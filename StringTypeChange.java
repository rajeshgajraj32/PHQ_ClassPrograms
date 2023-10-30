package com.question;

import java.util.Scanner;

public class StringTypeChange {

	static void printString(String str1) {
		String str = str1;
		int duration[] = new int[str.length()];
		Character charArr[] = new Character[str.length()];
		int count = 1, temp = 0;
		char demo = ' ';
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;
				}
			}
			charArr[i] = str.charAt(i);
			duration[i] = count;
			str = str.replaceAll(String.valueOf(str.charAt(i)), "");

			count = 1;
			temp++;
		}
		for (int i = 0; i < duration.length; i++) {
			if (duration[i] != 0) {
				for (int j = i; j < duration.length; j++) {
					if (duration[j] > 0) {
						if (duration[i] < duration[j]) {
							temp = duration[i];
							duration[i] = duration[j];
							duration[j] = temp;

							demo = charArr[i];
							charArr[i] = charArr[j];
							charArr[j] = demo;
						} else if (duration[i] == duration[j]) {
							if (charArr[i] > charArr[j]) {
								temp = duration[i];
								duration[i] = duration[j];
								duration[j] = temp;

								demo = charArr[i];
								charArr[i] = charArr[j];
								charArr[j] = demo;
							}
						}
					} else {
						break;
					}
				}
			} else {
				break;
			}

		}
		count = 0;
		for (int i : duration) {
			for (int j = 1; j <= i; j++) {
					System.out.print(charArr[count]);
			}
			count++;
		}

	}

	public static void main(String[] args) {
		StringTypeChange stc = new StringTypeChange();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String Normal_String = sc.next();
		printString(Normal_String);

	}

}
