package DayThree;

public class Base {
	//declare default private , PRotected, and variables 
	
	int varDefault = 10;
	public int varPublic = 20;
	private int varPrivate = 30;
	protected int varProtected = 40;
	
	//declare default, protected, ppublic and private method
	
	void methodDefault () {
		System.out.println("default access base class");
		System.out.println("Public variable:" + varDefault);
	}
	
	public void methodPublic()
	{
		System.out.println("public access base class");
		System.out.println("Public variable:" + varPublic);
	}
	
	private void methodPrivate() 
	{
		System.out.println("private access base class");
		System.out.println("private variable:" + varPrivate);
		
	}
	
	protected void methodProtected() 
	{
		System.out.println("protected access base class");
		System.out.println("protected variable:" + varProtected);
		
	}
	

}
