package com.miniproject2;
import java.util.Scanner;

public class MainEmployeeServiceApp {
	
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        EmployeeService service = new EmployeeService();

	        int ch;
	        do {
	            System.out.println("\n1.Add Employee");
	            System.out.println("2.Display Employees");
	            System.out.println("3.Search");
	            System.out.println("4.Update Salary");
	            System.out.println("5.Delete");
	            System.out.println("6.Departments");
	            System.out.println("7.Exit");

	            System.out.print("Choice: ");
	            ch = sc.nextInt();

	            try {
	                switch (ch) {
	                    case 1 -> {
	                        System.out.print("ID: ");
	                        int id = sc.nextInt();
	                        System.out.print("Name: ");
	                        String name = sc.next();
	                        System.out.print("Dept: ");
	                        String dept = sc.next();
	                        System.out.print("Salary: ");
	                        double sal = sc.nextDouble();

	                        service.add(new Employee(id, name, dept, sal));
	                        System.out.println("Employee Added");
	                    }
	                    case 2 -> service.displayAll();
	                    case 3 -> {
	                        System.out.print("ID: ");
	                        int id = sc.nextInt();
	                        System.out.println(service.find(id));
	                    }
	                    case 4 -> {
	                        System.out.print("ID: ");
	                        int id = sc.nextInt();
	                        System.out.print("Salary: ");
	                        double sal = sc.nextDouble();
	                        service.updateSalary(id, sal);
	                        System.out.println("Updated");
	                    }
	                    case 5 -> {
	                        System.out.print("ID: ");
	                        int id = sc.nextInt();
	                        service.delete(id);
	                        System.out.println("Deleted");
	                    }
	                    case 6 -> service.displayDepartments();
	                    case 7 -> System.out.println("Thank You");
	                    default -> System.out.println("Invalid Choice");
	                }
	            } catch (Exception e) {
	                System.out.println("Error: " + e.getMessage());
	            }
	        } while (ch != 7);
	    }
	}

