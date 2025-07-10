package String;

public class SampleStringDemo {
	
	public static void main(String[] args) {
		//initialize
		
		char c[] = {'i', 'n', 'd', 'i', 'a'};
		
		String s1 = new String(c);
		System.out.println(s1);
		
		String s2 = new String(s1);
		System.out.println(s2);
		
		//\t
		//concatination yo prevent long line
		
		String Longstr="this is show" + "how long sentence" + "can be prented" ;
		System.out.println(Longstr);
		
	}

}

