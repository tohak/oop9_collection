package com.konovalov;

import java.util.ArrayList;

import javax.print.attribute.standard.ReferenceUriSchemesSupported;

public class Group {

	private ArrayList<Student> list = new ArrayList<>();

	public Group(ArrayList<Student> list) {
		super();
		this.list = list;
	}

	public Group() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Student> getList() {
		return list;
	}

	public void setList(ArrayList<Student> list) {
		this.list = list;
	}

	public void add(Student newStudent) {
		if (check(newStudent) == false) {
			this.list.add(newStudent);
		} else {
			System.out.println("Error, this student is already on the group");
		}

	}

	public void del(Student delStudent) {
		if (check(delStudent) == true) {

			this.list.remove(this.list.indexOf(delStudent));
		} else {
			System.out.println("Error, this student is not on the group");
		}
	}

	public boolean check(Student searchStudent) {

		for (Student student : list) {
			if (student == searchStudent) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		for (Student student : list) {
			sb.append(student);
			sb.append(System.lineSeparator());
		}
		return sb.toString();
	}

}
