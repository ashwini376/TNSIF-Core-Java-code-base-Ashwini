package trycatch;

public class TryCatchExample {
	
	static void performDivision (int x, int y)
	{
		System.out.println("I an a method");
		int z;
		try {
			System.out.println("I an try blcok");
		
		z = x/y;
		System.out.println("Result of z:"+ z);
		}
		catch (ArithmeticException e)
		{
			System.err.println("i am in catch block:");
		}
	}

}
