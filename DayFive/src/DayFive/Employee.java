package DayFive;

public class Employee {
	
	//declare the instance variable
	
	private String name;
	private int id;
	//declare a static companyNAme
	static String companyname= "TNSIF";
	
	
	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + " , company=" + companyname+ "]";
	}
	
	
	

	

}
