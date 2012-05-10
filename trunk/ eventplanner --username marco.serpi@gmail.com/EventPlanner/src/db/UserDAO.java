package db;

import java.util.StringTokenizer;

import javax.swing.JOptionPane;

import model.User;
import bl.*;



public class UserDAO {
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private User currentUser;
	
	private String answer;
	
	
	public User login(String userName, String passWord) {
		this.answer = DB_Connector.request("SELECT * FROM tbl_user WHERE username = " + userName+ " AND password = " + passWord);
		if (this.answer == "") {

			// error message
			JOptionPane.showMessageDialog(null,"Login failed! Wrong Username or Password", "Error",JOptionPane.OK_CANCEL_OPTION);
			return null;

		} else {
			StringTokenizer st = new StringTokenizer(answer, ",");
			userName = st.nextToken();
			passWord = st.nextToken();
			firstName = st.nextToken();
			lastName = st.nextToken();
			dateOfBirth = st.nextToken();
			this.currentUser = new User(userName, passWord, firstName, lastName, dateOfBirth);
			return currentUser;
			

		}

	}
	public User regCheck(String userName, String passWord, String firstName, String lastName, String dateOfBirth){
		this.answer = DB_Connector.request("SELECT * FROM tbl_user WHERE username = " + userName+ " AND password = " + passWord+ " AND firstName = " + firstName+ "AND lastName = " + lastName+ "AND dateOfBirth = " + dateOfBirth);
		return null;
	}
	public User registration(String userName, String passWord, String firstName, String lastName, String dateOfBirth){
		
		return null;
	}
}
