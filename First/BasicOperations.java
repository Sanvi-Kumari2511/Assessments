package CoreJavaAssignments;
import java.util.*;

public class BasicOperations {
	public static void main(String args []) {
	Scanner sc = new Scanner(System.in);
	 System.out.print("Enter first string : ");
     String s = sc.nextLine();

     System.out.print("Enter second string : ");
     String s1 = sc.nextLine();

     // printing all operations
     
     // 1. length()
     System.out.println(s.length());

     // 2. isEmpty()
     System.out.println(s.isEmpty());

     // 3. charAt()
     System.out.println(s.charAt(1));

     // 4. toString()
     System.out.println(s.toString());

     // 5. equals()
     System.out.println(s.equals(s1));

     // 6. compareTo()
     System.out.println(s.compareTo(s1));

     // 7. contains()
     System.out.println(s.contains("a"));

     // 8. indexOf()
     System.out.println(s.indexOf("a"));

     // 9. lastIndexOf()
     System.out.println(s.lastIndexOf(s1));

     // 10. startsWith()
     System.out.println(s.startsWith("i"));

     // 11. endsWith()
     System.out.println(s.endsWith("s"));

     // 12. matches()
     System.out.println(s.matches(".*a.*"));

     // 13. substring()
     System.out.println(s.substring(1,3));

     // 14. toLowerCase()
     System.out.println(s.toLowerCase());

     // 15. trim()
     System.out.println(s.trim());

     // 16. replace()
     System.out.println(s.replace('a','x'));

     // 17. split()
     String arr[] = s.split(" ");
     System.out.println(arr.length);

     // 18. join()
     System.out.println(String.join("-", s, s1));

     // 19. valueOf()
     int num = 10;
     System.out.println(String.valueOf(num));


	}
}
