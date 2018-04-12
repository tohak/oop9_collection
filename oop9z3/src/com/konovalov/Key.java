package com.konovalov;

import java.util.Iterator;

public class Key {

	private char key;
	private int counter;

	public Key(char key, int counter) {
		super();
		this.key = key;
		this.counter = counter;
	}

	public char getKey() {
		return key;
	}

	public void setKey(char key) {
		this.key = key;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	@Override
	public String toString() {
		return "Key [key=" + key + ", counter=" + counter + "]";
	}

}
