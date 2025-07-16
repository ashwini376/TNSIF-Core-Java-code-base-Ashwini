package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;




public class JDBCRead {
	
	
		
		public static void main(String[] args) {
			
			try {
				//step 1: Load or register the driver
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("Driver is loaded successfully");
				
				//step2: create connection 
				
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dypatil", "root", "Ashu@123" );
				System.out.println("Connection create successfuly");
				
				//step3: create a statement
				Statement stmt = con.createStatement();
				
				System.out.println("Statement created successfully");
				
				java.sql.ResultSet rs = stmt.executeQuery("Select * from student");				
				//step4 : write a query
				
				//String q= "create table student(stdid int , name varchar(20), subject varchar(20), duration double)";
				//String q= "insert into student value(102, 'zeel','marathi', 65.66)";
				//String q= "alter table student add primary key(stdid)";
				
				String q = "Update student set subject='DBMS' where stdid=101";
				
				while(rs.)
						
						int s=stmt.executeUpdate(q);
				
				
				
			
				
				
				
			}
			catch(Exception e)
			
			{
				System.err.println(e);
			}
		}

	}




	
	
	

