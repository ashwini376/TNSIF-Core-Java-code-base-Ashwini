package finaldemo;

public class finalVariable {
	
	//final int x; final instance variable must be initialize
	
	final int x = 100;
	
	//declaring a static blank final variable
	
	final static int y;
	
	
	//declare and initialized
	
	final static int z=10;
	
	//instance method
	
	void change()
	{
//		x=30;  //final variabl chant change 
//		z=50;  //or reassign 
	}

	@Override
	public String toString() {
		return "finalVariable [x=" + x + " , y=" + y + "]";
	}
	
	//declare static block
	
	static
	{
		y=20;
		//z=90;  //ones initialized can't be reassigned
	}
	
	
	
	
	
	

}
