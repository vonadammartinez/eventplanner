package db;

import java.io.*;
import java.sql.*;

public class DB_Connector {
	
	public static String request(String request) {
		String answer = "";
		try {
			String driver = null;
			String DbUrl = null;
			// *** "name of driver
			driver = "org.gjt.mm.mysql.Driver";
			// *** "URL of database *********
			// *** Server : localhost
			// *** db name : event_db
			// *** table name cdr_component
			DbUrl = "jdbc:mysql://localhost/event_db";
			// *** load driver ***********************************
			Class.forName(driver).newInstance();
			// *** establish connection: ************************
			// *** user: root pw:
			Connection cn = DriverManager.getConnection(DbUrl, "root",
					"");

			try {
				Statement st = cn.createStatement();
				ResultSet rs = st.executeQuery(request);
				ResultSetMetaData rsmd = rs.getMetaData();
				int n;
				int nmax = rsmd.getColumnCount();

				while (rs.next()) { // **** output **********
					for (n = 1; n <= nmax; n++) {

						answer += rs.getString(n) + ",";
					}

				}

				rs.close();
				st.close();

			} catch (SQLException ex) {
				System.out.println(ex);
			}
			cn.close();
		} catch (Exception ex) {
			System.out.println(ex);
		}
		return answer;

	}
	public static String request2(String request) {
		String answer = "";
		try {
			String driver = null;
			String DbUrl = null;
			// *** "name of driver
			driver = "org.gjt.mm.mysql.Driver";
			// *** "URL of database *********
			// *** Server : localhost
			// *** db name : event_db
			// *** table name cdr_component
			DbUrl = "jdbc:mysql://localhost/event_db";
			// *** load driver ***********************************
			Class.forName(driver).newInstance();
			// *** establish connection: ************************
			// *** user: root pw:
			Connection cn = DriverManager.getConnection(DbUrl, "root",
					"");

			try {
				Statement st = cn.createStatement();
				st.executeUpdate(request);
				/*ResultSet rs = st.executeUpdate(request);
				ResultSetMetaData rsmd = rs.getMetaData();
				int n;
				int nmax = rsmd.getColumnCount();

				while (rs.next()) { // **** output **********
					for (n = 1; n <= nmax; n++) {

						answer += rs.getString(n) + ",";
					}

				}

				rs.close();
				st.close();*/

			} catch (SQLException ex) {
				System.out.println(ex);
			}
			cn.close();
		} catch (Exception ex) {
			System.out.println(ex);
		} 
		return answer;

	}
}


