import java.io.IOException;
import java.sql.SQLException;

import DBManger.DBManger;

import View.WindowManger;

/* Use Case
 	- User can add, remove and edit any of the fields of any units.
 
 */

public class Main {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException{
		
		DBManger dbm = new DBManger();
	
		dbm.initialization();
	
		new WindowManger();
	}
}

