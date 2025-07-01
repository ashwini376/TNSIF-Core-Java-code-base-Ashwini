package dayOne;

public class TypeCasting {
	
	public static void main(String[] args) {
		//widening // implicit type casting
		byte b = 10;
		int i =b;
		System.out.println(i);
		
		float f =22.14f;
		double d =f;
		System.out.println(d);
		
		//narrowing // explicit type casting

		double f1 = 10.52f;
		long l1 =(long) f1;
		System.out.println(l1);
		
		long l2 = 9021645343L;
		int il2 = (int) l2;
		System.out.println(il2);


		
		
		
	}

}

