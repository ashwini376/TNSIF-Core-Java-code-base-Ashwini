package finaldemo;


final class FinalClass {
	void show()
	{
		System.out.println("final class can not be inherited");
	}
}

//class Student extends FinalClass{
//	
//}
public class FinalClassDemo {
	
	public static void main(String[] args) {
		FinalClass f = new FinalClass();
		f.show();
	}

}
