package com.konovalov;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		File fileOpen = new File("a.txt");
		char[] text = FileOperation.fileToText(fileOpen);

		CounterKey list = new CounterKey();
		list.addArray(text);
		list.sort();
		System.out.println(list);

	}

}
