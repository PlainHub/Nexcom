
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.sql.DataSource;


import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class DBManger {

	private static DataSource ds = null;
	
	private static final String Username = "root";
	private static final String Password = "200020";

	// Generate a DataSource of a database by read configuration file.
	public static DataSource getMySQLDataSource() {
		
		MysqlDataSource mysqlDS = new MysqlDataSource();
		mysqlDS.setURL("jdbc:mysql://localhost:3306/NQWarehouse");
		mysqlDS.setUser(Username);
		mysqlDS.setPassword(Password);
		return mysqlDS;
		
	}
	
	// Create a server table
	public static void CreateServerTable() {
		
		try {
			Connection con = ds.getConnection();
			Statement stmt = con.createStatement();
			
			String Query = "CREATE TABLE ServerInventory (\n 	ProductNumber VARCHAR(255) DEFAULT NULL,\n"
					+ "	ProductName VARCHAR(255) DEFAULT NULL,\n"
					+ " 	SerialNumber VARCHAR(255) NOT NULL UNIQUE,\n"
					+ " 	FRUType VARCHAR(255) DEFAULT NULL,\n"
					+ " 	PRIMARY KEY (SerialNumber));";
			
			System.out.println(Query + "\n");
			stmt.executeUpdate(Query);
			con.close();
		}
		
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	// Use Case: determine a specific part by given Part Number
	public static void PartNumberSearching(String pn) {

		
	}
}
