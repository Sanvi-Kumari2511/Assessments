package com.miniproject3;
import java.util.*;

public class StudentService {
	private ArrayList<Student> students = new ArrayList<>();

    // Add Student
    public void addStudent(Student s) throws StudentException {

        for (Student st : students) {
            if (st.getEnrollmentNo() == s.getEnrollmentNo()) {
                throw new StudentException("Enrollment number already exists");
            }
        }

        if (s.getPercentage() <= 0) {
            throw new StudentException("Percentage must be positive");
        }

        students.add(s);
        System.out.println("Student added successfully");
    }

    // Display Students
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No student records found");
            return;
        }

        System.out.println("Eno\tName\tBranch\tSem\tPercentage");
        for (Student s : students) {
            System.out.println(s);
        }
    }

    // Search Student
    public Student searchStudent(int eno) {
        for (Student s : students) {
            if (s.getEnrollmentNo() == eno)
                return s;
        }
        return null;
    }

    // Update Branch
    public void updateBranch(int eno, String newBranch) throws StudentException {
        Student s = searchStudent(eno);
        if (s == null) {
            throw new StudentException("Student not found");
        }
        s.setBranch(newBranch);
        System.out.println("Branch updated successfully");
    }

    // Delete Student
    public void deleteStudent(int eno) {
        students.removeIf(s -> s.getEnrollmentNo() == eno);
        System.out.println("Student deleted (if existed)");
    }

    // Sort Students
    public void sortStudents() {
        students.sort(Comparator.comparingInt(Student::getEnrollmentNo));
        displayStudents();
    }
}
