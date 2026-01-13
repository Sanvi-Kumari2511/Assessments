package com.miniproject3;

public class Student {
	 private int enrollmentNo;
	    private String name;
	    private String branch;
	    private int semester;
	    private double percentage;

	    public Student(int enrollmentNo, String name, String branch,
	                   int semester, double percentage) {
	        this.enrollmentNo = enrollmentNo;
	        this.name = name;
	        this.branch = branch;
	        this.semester = semester;
	        this.percentage = percentage;
	    }

	    public int getEnrollmentNo() {
	        return enrollmentNo;
	    }

	    public String getBranch() {
	        return branch;
	    }

	    public void setBranch(String branch) {
	        this.branch = branch;
	    }

	    public double getPercentage() {
	        return percentage;
	    }

	    @Override
	    public String toString() {
	        return enrollmentNo + "\t" + name + "\t" +
	               branch + "\t" + semester + "\t" + percentage;
	    }
}
