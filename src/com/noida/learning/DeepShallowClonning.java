package com.noida.learning;

class Subject {
	String s1;

	public Subject(String s1) {
		super();
		this.s1 = s1;
	}

}

class Student implements Cloneable {
	int roll_number;

	Subject subject;

	public Student(int roll_number, Subject subject) {
		super();
		this.roll_number = roll_number;
		this.subject = subject;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}

public class DeepShallowClonning {
	public static void main(String[] args) throws CloneNotSupportedException {

		Subject s1=new Subject("English");
		Student st1 = new Student(100,s1);

		Student st2 = (Student) st1.clone();
		st2.subject.s1 = "Maths";

		System.out.println("------To check the default clonning method in java------");

		System.out.println("Subject in st1 : " + st1.subject.s1 + "Subject in st2 : " + st2.subject.s1);

	}
}
