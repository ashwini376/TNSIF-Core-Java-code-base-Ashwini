package setDemo;

import java.util.HashSet;
import java.util.Set;

public class StudentSetDemo {
	
	public static void main(String[] args) {
		Set<student> set = new HashSet<student>();
		set.add(new student(101, "Ashu", 45.09));
		set.add(new student(101, "Zeel", 78.89));
		set.add(new student(1012, "Heti" , 90.87));
		
		System.out.println(set);
		
		
	}

}
