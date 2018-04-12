package com.konovalov;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileOperation {

	public static char[] fileToText(File file) {
		String text = " ";
		String temp = "";
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			for (; (temp = br.readLine()) != null;)
				text += temp;
		} catch (IOException e) {
			System.out.println(" Error, write file");
		}
		try {
			char textArray[] = text.toCharArray();
			return textArray;
		} catch (NullPointerException e) {
			System.out.println("Error, text=null");
		}
		return null;
	}
}
