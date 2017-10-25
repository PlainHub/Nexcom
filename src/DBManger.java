import javax.sql.DataSource;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class DBManger {

	private static final String Username = "root";
	private static final String Password = "200020";

	public static DataSource getMySQLDataSource() {
		
		MysqlDataSource mysqlDS = new MysqlDataSource();
		
		mysqlDS.setURL("jdbc:mysql://localhost:3306/NQWarehouse");
		mysqlDS.setUser(Username);
		mysqlDS.setPassword(Password);
		
		return mysqlDS;
		
	}
}
