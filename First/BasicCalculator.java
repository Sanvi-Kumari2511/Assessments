package CoreJavaAssignments;
import java.util.*;

public class BasicCalculator {
	public static int add(int a, int b) {
	        return a + b;
	    }

	    public static int subtract(int a, int b) {
	        return a - b;
	    }

	    public static int multiply(int a, int b) {
	        return a * b;
	    }

	    public static int divide(int a, int b) {
	        return a / b;   
	    }

	    public static int remainder(int a, int b) {
	        return a % b;
	    }
	    
	    public static int square(int a) {
	        return a * a;
	    }

	    public static int cube(int a) {
	        return a * a * a;
	    }

	    public static int absolute(int a) {
	        return (a < 0) ? -a : a;
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter first number : ");
	        int n1 = sc.nextInt();

	        System.out.print("Enter second number : ");
	        int n2 = sc.nextInt();

	        System.out.println("Addition = " + add(n1, n2));
	        System.out.println("Subtraction = " + subtract(n1, n2));
	        System.out.println("Multiplication = " + multiply(n1, n2));
	        System.out.println("Division = " + divide(n1, n2));
	        System.out.println("Remainder = " + remainder(n1, n2));

	        System.out.println("Square of first number = " + square(n1));
	        System.out.println("Cube of first number = " + cube(n1));
	        System.out.println("Absolute value of first number = " + absolute(n1));

	    }
	}

