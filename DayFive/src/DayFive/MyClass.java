package DayFive;

public class MyClass {
	
	private int section;   //non static or instance
	private static int srNo; // static or class variable
	
	//static block
	
	static {
		System.out.println(" ............within static block.........");
		srNo=1000;
		//static= 23444;
		
		
	}
   // default const
	public MyClass() {
		System.out.println("...within default constructor......");
		srNo++;
		section++;
	}
	@Override
	public String toString() {
		return "MyClass [serial No "+srNo+ ", section=" + section + "]";
	}
	
	//static method
	static void display()
	{
		//System.out.println("Section :" +section);
		System.out.println("serial No: " +srNo);
	}
	
	

}
