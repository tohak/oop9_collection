package com.konovalov;

import java.util.ArrayDeque;

public class Main {

	public static void main(String[] args) {
		ArrayDeque<String> queueCola = new ArrayDeque<>();
		int countCola = 7;
		queueCola.add("a");
		queueCola.add("b");
		queueCola.add("c");
		queueCola.add("d");
		queueCola.add("e");
		for (int i = 0; i < countCola; i++) {
			String temp = queueCola.pollFirst();
			queueCola.addLast(temp);
			queueCola.addLast(temp);
		}
		System.out.println(queueCola);
	}
}
