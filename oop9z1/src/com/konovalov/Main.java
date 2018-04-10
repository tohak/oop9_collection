package com.konovalov;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		createList();

	}
	
	public static void createList() {
		ArrayList<Integer> list=new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add( (int) (Math.random()*11));
		}
		System.out.println("Create list"+ list);
		list.remove(0);
		list.remove(0);
		int temp=list.size()-1;
		list.remove(temp);
		System.out.println("New list"+list);
	}
	

}