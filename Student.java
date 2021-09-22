package org.student;

public class Student extends Department {
	public void studentName() {
		System.out.println("Student Name: Arthi");
	}
	public void studentDept() {
		System.out.println("Student Department: Computer Science");
	}
	public void studentId() {
		System.out.println("Student ID: ACS22");
	}
	public static void main(String[] args) {
		Student st = new Student();
		st.collegeName();
		st.collegeCode();
		st.collegeRank();
		st.deptName();
		st.studentName();
		st.studentDept();
		st.studentId();
	}
}
