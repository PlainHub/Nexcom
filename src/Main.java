import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import javax.sql.DataSource;

/* Use Case
 	- User can add, remove and edit any of the fields of any units.
 
 */

public class Main {
	private static DataSource ds = null;
	
	public static void main(String[] args) {
		ds = DBManger.getMySQLDataSource(); // Get the database instance
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to NQ-Kaminario Console. How can I assist you?\n"
				+ "1. Received an item");
		
		while(sc.hasNext()){
			if (sc.next().equals("1")) {
				System.out.println("Please enter the part number.");
			}
			
		}
	}
}

