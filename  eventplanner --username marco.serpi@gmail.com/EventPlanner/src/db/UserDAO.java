package db;

import java.util.StringTokenizer;

import javax.swing.JOptionPane;

import model.User;
import bl.*;

public class UserDAO {
	private String firstName;
	private String lastName;
	private String dateOfBirth;

	private String answer;

	public User login(String userName, String passWord) {
		answer = DB_Connector
				.request("SELECT * FROM tbl_user WHERE username = '" + userName
						+ "' AND password = '" + passWord + "'");
		if (answer == "") {
			return null;

		} else {
			StringTokenizer st = new StringTokenizer(answer, ",");
			userName = st.nextToken();
			passWord = st.nextToken();
			firstName = st.nextToken();
			lastName = st.nextToken();
			dateOfBirth = st.nextToken();
			return new User(userName, passWord, firstName, lastName,
					dateOfBirth);

		}

	}

	public User registration(String userName, String passWord,
			String firstName, String lastName, String dateOfBirth) {
		answer = DB_Connector
				.request("SELECT * FROM tbl_user WHERE username = '" + userName + "'");

		if (answer == "") {
			DB_Connector
					.request2("INSERT INTO tbl_user(username, password, firstname, lastname, dateofbirth) VALUES ('"
							+ userName
							+ "', '"
							+ passWord
							+ "', '"
							+ firstName
							+ "', '" + lastName + "', '" + dateOfBirth + "')");
			User u = new User(userName, passWord, firstName, lastName,
					dateOfBirth);
			return u;
		} else {
			return null;
		}

	}
}
