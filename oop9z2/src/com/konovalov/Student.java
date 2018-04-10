package com.konovalov;

public class Student {
	
private String Lastname;
private String name;
private int age;
private String faculty;

public Student(String lastname, String name, int age, String faculty) {
	super();
	Lastname = lastname;
	this.name = name;
	this.age = age;
	this.faculty = faculty;
}

public Student() {
	super();
	// TODO Auto-generated constructor stub
}

public String getLastname() {
	return Lastname;
}

public void setLastname(String lastname) {
	Lastname = lastname;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getFaculty() {
	return faculty;
}

public void setFaculty(String faculty) {
	this.faculty = faculty;
}

@Override
public String toString() {
	return "Student [Lastname=" + Lastname + ", name=" + name + ", age=" + age + ", faculty=" + faculty + "]";
}


}
