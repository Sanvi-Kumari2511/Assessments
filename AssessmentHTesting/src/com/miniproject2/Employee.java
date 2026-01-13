package com.miniproject2;
import java.io.Serializable;

public class Employee implements Serializable, Comparable<Employee> {
	
	 private int id;
	    private String name;
	    private String department;
	    private double salary;

	    public Employee(int id, String name, String department, double salary) {
	        this.id = id;
	        this.name = name;
	        this.department = department;
	        this.salary = salary;
	    }

	    public int getId() { return id; }
	    public String getName() { return name; }
	    public String getDepartment() { return department; }
	    public double getSalary() { return salary; }

	    public void setSalary(double salary) { this.salary = salary; }

	    @Override
	    public int compareTo(Employee e) {
	        return this.id - e.id;   
	    }

	    @Override
	    public String toString() {
	        return id + "\t" + name + "\t" + department + "\t" + salary;
	    }

}
