import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.sql.DataSource;

/* Use Case
 	- User can add, remove and edit any of the fields of any units.
 
 */


public class Main {
	static DataSource ds = null;

	public static void main(String[] args) {
		LoadDataBase();
		TestDataBase();

	}
	
	private static void LoadDataBase() {
		 ds = DBManger.getMySQLDataSource();
	}
	
	private static void TestDataBase() {
		
		try {
			Connection con = ds.getConnection();
			Statement stmt = con.createStatement();
			String Query = "CREATE TABLE ServerInventory (\n 	ProductNumber VARCHAR(255) DEFAULT NULL,\n"
					+ "	ProductName VARCHAR(255) DEFAULT NULL,\n"
					+ " 	SerialNumber VARCHAR(255) NOT NULL UNIQUE,\n"
					+ " 	FRUType VARCHAR(255) DEFAULT NULL,\n"
					+ " 	PRIMARY KEY (SerialNumber));";
			System.out.println(Query + "\n");
			
			// Create a server table
			stmt.executeUpdate(Query);
			con.close();
		}
		
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

}

