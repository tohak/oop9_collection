package com.konovalov;

import java.util.Comparator;

public class KeyComporator implements Comparator<Key> {

	@Override
	public int compare(Key a, Key b) {
		if (a.getCounter() > b.getCounter()) {
			return -1;
		} else if (a.getCounter() < b.getCounter()) {
			return 1;
		} else
			return 0;
	}

}
