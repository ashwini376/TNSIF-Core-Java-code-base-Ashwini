package dayOne;

public class charDemo {

	public static void main(String[] args) {
		//assign the single character literal
		
//		char ch=66;
//		System.out.println(ch);
//		
//		int name = 'a';
//		System.out.println(name);
//		
//	   //assign unicode to character
//		
//		char var1 = '\u00A7';
//		System.out.println(var1);
//		
//		char var3 = '\u20AC';
//		System.out.println(var3);
//		
		
		
		//byte take 1 byte
		//1 byte =  8bits   //2^8
		//256/2
		//128
		
		byte byteMax = 127;
		byte byteMin = -128;
		System.out.println("Min range of byte is :-" + byteMin + " Max range" + byteMax);
		
		//short  ---2 byte
		short shortMix = 32767;
		short shortMin = -32768;
		System.out.println("Min range of short is :-" + shortMix + " Max range" + shortMin);
		
		//int ----4 byte
		int maxInt = 2147483647;
		int minInt = -2147483648;
		System.out.println("Min range of int is :-" + maxInt + " Max range" + minInt);

		//long --8 byte
		long maxLong = 9223372036854775807L;
		long minLong = -9223372036854775808L;
		
		System.out.println("Min range of int is :-" + maxLong + " Max range" + minLong);
		
		//float 4
		float f = 3234.141243278545f;
		double d = 3456.14124512345678902345678914f;
		
		System.out.println(f);
		System.out.println(d);

		
		
		

		
		
		
		}
}
