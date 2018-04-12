package com.konovalov;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CounterKey {
	List<Key> list = new ArrayList<>();

	public CounterKey() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Key> getList() {
		return list;
	}

	public void setList(List<Key> list) {
		this.list = list;
	}

	public void addArray(char[] text) {

		for (int i = 0; i < text.length; i++) {
			if (Character.isLetter(text[i])) {
				if (list.size() == 0 || check(text[i]) == false) {
					addChar(text[i]);
				} else {
					addCountLetter(text[i]);
				}
			}

		}
	}

	public void addChar(char letter) {
		list.add(new Key(letter, 1));
	}

	public boolean check(char letter) {
		boolean check = false;
		for (Key key : list) {
			if (key.getKey() == letter) {
				check = true;
			}
		}
		return check;
	}

	public void addCountLetter(char letter) {
		for (Key key : list) {
			if (key.getKey() == letter) {
				key.setCounter(key.getCounter() + 1);
			}
		}
	}

	public void sort() {
		list.sort(new KeyComporator());
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		for (Key key : list) {
			sb.append(key);
			sb.append(System.lineSeparator());
		}
		return sb.toString();
	}

}
