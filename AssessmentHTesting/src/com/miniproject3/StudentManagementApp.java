package com.miniproject3;
import java.util.Scanner;

public class StudentManagementApp {
	static Scanner sc = new Scanner(System.in);

    // Login
    static void login() {
        while (true) {
            System.out.print("Username: ");
            String u = sc.next();
            System.out.print("Password: ");
            String p = sc.next();

            if (u.equals("admin") && p.equals("admin123")) {
                System.out.println("Login Successful\n");
                return;
            }
            System.out.println("Invalid Login\n");
        }
    }

    public static void main(String[] args) {

        login();
        StudentService service = new StudentService();
        int choice;

        do {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Branch");
            System.out.println("5. Delete Student");
            System.out.println("6. Sort Students");
            System.out.println("7. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1 -> {
                        System.out.print("Eno: ");
                        int eno = sc.nextInt();
                        System.out.print("Name: ");
                        String name = sc.next();
                        System.out.print("Branch: ");
                        String branch = sc.next();
                        System.out.print("Semester: ");
                        int sem = sc.nextInt();
                        System.out.print("Percentage: ");
                        double per = sc.nextDouble();

                        service.addStudent(
                                new Student(eno, name, branch, sem, per));
                    }
                    case 2 -> service.displayStudents();
                    case 3 -> {
                        System.out.print("Enter Eno: ");
                        int eno = sc.nextInt();
                        Student s = service.searchStudent(eno);
                        System.out.println(
                                s != null ? s : "Student not found");
                    }
                    case 4 -> {
                        System.out.print("Eno: ");
                        int eno = sc.nextInt();
                        System.out.print("New Branch: ");
                        String br = sc.next();
                        service.updateBranch(eno, br);
                    }
                    case 5 -> {
                        System.out.print("Eno: ");
                        int eno = sc.nextInt();
                        service.deleteStudent(eno);
                    }
                    case 6 -> service.sortStudents();
                    case 7 -> System.out.println("Thank You");
                    default -> System.out.println("Invalid Choice");
                }
            } catch (StudentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (choice != 7);
    }
}
