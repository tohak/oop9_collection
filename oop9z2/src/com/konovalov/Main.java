package com.konovalov;

public class Main {

	public static void main(String[] args) {
		Group kn1=new Group();
		kn1.add(new Student("StudentOne", "nameStudent", 20, "IT"));
		kn1.add(new Student("StudentTho", "nameStudentTho", 21, "IT"));
		kn1.add(new Student("StudentThree", "nameStudentThree", 22, "IT"));
		kn1.add(new Student("StudentFour", "nameStudentFour", 21, "IT"));
		kn1.add(new Student("StudentFive", "nameStudentFive", 23, "Telecom"));
		Student studentNew=new Student("StudentNew", "nameSt", 20, "it");
		kn1.add(studentNew);
		
		System.out.println(kn1);
		
		kn1.del(studentNew);
		System.out.println("new group\n"+kn1);
	}

}
