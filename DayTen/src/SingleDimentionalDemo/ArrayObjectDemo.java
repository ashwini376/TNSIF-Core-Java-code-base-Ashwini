package SingleDimentionalDemo;

public class ArrayObjectDemo {
	
	public static void main(String[] args) {
		
		//student s=new student(0, null)
		
		Student [] arr;
		
		//declared memory for 5 object or type student
		
		arr = new Student[5];
		arr[0] = new Student(101, "Heti");
		arr[1] = new Student(102, "zeel");
		arr[2] = new Student(103, "Ashu");
		arr[3] = new Student(104, "Nikhil");
		arr[4] = new Student(105, "chetan");
		
		for (int i =0; i <=arr.length;i++)
		{
			System.out.println("value is"+i+ ":" +arr[i].getRollNo()+ "\t" +arr[i].getName());
		}
		
	}

}
