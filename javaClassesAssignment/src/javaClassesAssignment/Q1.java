package javaClassesAssignment;

public class Q1 {

	public static void main(String[] args) {
	
		Student student = new Student();
		student.name = "John";
		student.roll_no = 2;
		
		System.out.println("Student name is " + student.name + " and roll number is " + student.roll_no);
	}

}

 class Student{
	String name;
	int roll_no;
}