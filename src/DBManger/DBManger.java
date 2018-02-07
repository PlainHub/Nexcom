package DBManger;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBManger {

	public static String dbms = "mysql";
	public static String serverName = "localhost";
	public static String portNumber = "3306";
	public static String userName = "root";
	public static String password = "200020";

	public static Connection conn;

	public void initialization() throws ClassNotFoundException, SQLException, IOException {

		conn = DBEH.getConnection(dbms, serverName + ":" + portNumber + "/", userName, password);
		DBEH.createDatabase(conn, "kaminario");

		conn = DBEH.getConnection(dbms, serverName + ":" + portNumber + "/kaminario", userName, password);
		DBEH.createTable(conn, "C:\\Users\\peter\\Desktop\\Kaminario RM\\inventory tables.txt");
		
		System.out.println("Done");
	}
	
	public static boolean isExisted(String tableName, String columnName, String condition) throws SQLException {

		String qry = ("SELECT " + columnName + " FROM " + tableName + " WHERE " + condition + ";");

		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(qry);

		if (!rs.next())
			return false;

		return true;
	}

	public static void insert(String tableName, String[] columnName, Object[] value) throws SQLException {

		Statement stat = conn.createStatement();
		
		StringBuilder qry = new StringBuilder("INSERT INTO " + tableName + "(");

		for (int i = 0; i < columnName.length; i++)
			qry.append(columnName[i] + ", ");

		qry.delete(qry.length() - 2, qry.length() - 1); // remove the last comma and white space
		qry.append("), VALUE (");

		for (int j = 0; j < columnName.length; j++)
			qry.append(columnName[j] + ", ");

		qry.delete(qry.length() - 2, qry.length() - 1); // remove the last comma and white space
		qry.append(");");
		
		stat.execute(qry.toString());
		stat.close();
	}

	public static void update(String tableName, String[][] destination, String condition) throws SQLException {

		Statement stat = conn.createStatement();
		
		StringBuilder qry = new StringBuilder("UPDATE " + tableName + " SET ");

		for (int i = 0; i < destination.length; i++)
			qry.append(destination[i][0] + " = " + destination[i][1] + ", ");

		qry.delete(qry.length() - 2, qry.length() - 1); // remove the last comma and white space

		if (!condition.isEmpty()) // If condition is specified, add it to the query.
			qry.append(" WHERE " + condition);

		qry.append(";");
		
		stat.executeUpdate(qry.toString());
		stat.close();
	}

	// Directly insert an object into data by a given query.
	public static void insertObject(String qry, Object unit) throws ClassNotFoundException, SQLException, IOException {

		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(baos);
		oos.writeObject(unit);
		byte[] POKasBytes = baos.toByteArray();

		// Write an SQL query to insert the object into the database
		PreparedStatement pstmt = conn.prepareStatement(qry);
		ByteArrayInputStream bais = new ByteArrayInputStream(POKasBytes);
		pstmt.setBinaryStream(1, bais, POKasBytes.length);
		pstmt.executeUpdate();
		pstmt.close();
	}

	// Direct retrieve Objects from database.
	public static Object[] retrieveObjects(String qry) throws ClassNotFoundException, SQLException, IOException {

		Object[] objects = null;
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("qry");

		// Find number of rows and initialize the return object collection size.
		if (rs.last()) {
			objects = new Object[rs.getRow()];
			rs.beforeFirst(); // reset the point of the result set back to the first item
		}

		// Iterator over the result set and retrieve objects from result set
		while (rs.next()) {
			byte[] unitData = (byte[]) rs.getObject(2);
			ByteArrayInputStream baip = new ByteArrayInputStream(unitData);
			ObjectInputStream ois = new ObjectInputStream(baip);
			objects[rs.getRow()] = ois.readObject();
		}

		rs.close();
		stmt.close();

		return objects;
	}
}