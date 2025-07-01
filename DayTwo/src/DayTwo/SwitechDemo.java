package DayTwo;

public class SwitechDemo {
	public static void main(String[] args) {
		int userInput=8;
		
		switch(userInput)
		{
		
		case 1: System.out.println("Current recharge details");
		break;
		
		case 2: System.out.println("current rearch expired");
		break;
		
		case 3: System.out.println("Talk to uor customer support person");
		break;
		
		default:
		System.out.println(userInput+ "Not a valid input given by you");
		
		}
	}

}
