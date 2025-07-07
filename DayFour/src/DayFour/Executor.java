package DayFour;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address address = new Address("405 viman nagar" , "Pune", "Maharashtra", 767676 );
		
		Person p = new Person("Ashu", address);
		p.displayInfo();
		System.out.println(p);

	}

}
