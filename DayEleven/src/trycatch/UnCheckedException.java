package trycatch;

public class UnCheckedException {
	
	public static void main(String[] args) {
		int x[];
		try {
			x=new int[] {1,2,3,4,5,6};
			System.out.println(x[2]);
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Specified index does not exist:" +e.getMessage());
		}
	}

}
