package multithreding;

public class ChildThread extends Thread{
	
	int n;
	String msg;
	
	public ChildThread(int n, String msg) {
		super();
		this.n = n;
		this.msg = msg;
	}
	
	public void run()
	{
		for(int i=1; i<n; i++)
		{
			try {
				Thread.sleep(1000);
				
			}
			catch(InterruptedException e)
			{
				System.out.println(e.getMessage());
			}
			System.out.println(i + msg);
			
		}
		
	}
	
	
	
	

}
