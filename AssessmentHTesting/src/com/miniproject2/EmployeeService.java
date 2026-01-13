package com.miniproject2;
import java.io.*;
import java.util.*;


public class EmployeeService {
	
	private List<Employee> employees = new ArrayList<>();
    private final String FILE = "employees.dat";

    public EmployeeService() {
        load();
    }

    public void add(Employee e) throws Exception {
        for (Employee emp : employees)
            if (emp.getId() == e.getId())
                throw new Exception("Duplicate ID");

        employees.add(e);
        save();
    }

    public Employee find(int id) {
        return employees.stream()
                .filter(e -> e.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public void updateSalary(int id, double salary) throws Exception {
        if (salary <= 0)
            throw new Exception("Invalid Salary");

        Employee e = find(id);
        if (e == null)
            throw new Exception("Employee Not Found");

        e.setSalary(salary);
        save();
    }

    public void delete(int id) {
        employees.removeIf(e -> e.getId() == id);
        save();
    }

    public void displayAll() {
        employees.stream()
                .sorted()
                .forEach(System.out::println);
    }

    public void displayDepartments() {
        employees.stream()
                .map(Employee::getDepartment)
                .distinct()
                .forEach(d -> System.out.println("- " + d));
    }

    private void save() {
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(FILE))) {
            oos.writeObject(employees);
        } catch (Exception ignored) {}
    }

    private void load() {
        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(FILE))) {
            employees = (ArrayList<Employee>) ois.readObject();
        } catch (Exception e) {
            employees = new ArrayList<>();
        }
    }
}
