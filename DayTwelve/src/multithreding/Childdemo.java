package multithreding;

public class Childdemo {
	
	public static void main(String[] args) {
		ChildThread c = new ChildThread(10, "HEllo");
		
	
	c.start();
	System.out.println("End of the program");
	
}


}
