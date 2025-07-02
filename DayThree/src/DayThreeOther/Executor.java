package DayThreeOther;

import DayThree.Base;

public class Executor {
	public static void main(String[] args) {
		//accessing differing package class
		
		Base b1 = new Base();
		
		//private, default, protected, and public
		
		b1.methodPublic();
		b1.varPublic=34534;
		b1.methodPublic();
		
	}

}
