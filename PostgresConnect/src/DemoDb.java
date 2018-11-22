import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;



public class DemoDb {
	


	public static void main(String[] args) {
		Connection c = null;
		Statement s = null;
		try {
			
			Class.forName("org.postgresql.Driver");
			c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Testdatabase", "postgres", "legend");
			c.setAutoCommit(false);
			System.out.println("Database Works Successfully.....");
			System.out.println();
			
			s = c.createStatement();
			ResultSet Rs = s.executeQuery("SELECT * FROM test.Testtable WHERE name like 'S%' AND id='E04' ");
			while(Rs.next()) {
				
				String id = Rs.getString("id");
				String name = Rs.getString("name");
				String country_code = Rs.getString("country_code");
				
				System.out.println("ID = "+id);
				System.out.println("name = "+name);
				System.out.println("Country_Code = "+country_code);
				System.out.println();
				
			}
			Rs.close();
			c.close();
			s.close();
		}catch(Exception e) {
			
			System.err.println(e.getClass().getName()+": " +e.getMessage());
			System.exit(0);
		}
		
		
			
		}

}
