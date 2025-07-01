package dayOne;

public class IdentifierDemo {
	
	public static void main(String[] args) {
		//int num 1 = 13; error becoz of space
		// int @num = 13;  splacial are not allowed only $ _ are allowed
		
		// valid identifier
		 
//		int $num1 =20;
//		String StudentName = "Heti";
//		int FOR = 20;
//		System.out.println("Value of the number varialble : = " + $num1);
//		System.out.println("Student name : = " + StudentName);

		
		int value1 = 9/2;  // integer division 
		System.out.println(value1);
		
		float value2 = 101f/61f;
		System.out.println(value2);
        double value3 = 10d/6d;
        System.out.println(value3);
		int radius = 10;
		double percentage = 3.14 * radius * radius;
		System.out.println("area of circle :=" +percentage);
	}

}
