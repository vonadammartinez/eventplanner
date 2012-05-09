package bl;


import java.util.HashMap;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;

import db.DB_Connector;

import model.User;
import gui.*;

public class UserSession {
	
	private User currentUser;
	private String answer;
	
	private String userName;
	private String passWord;
	private String lastName;
	private String firstName;
	private String dateOfBirth;
	
	public UserSession(String userName, String passWord){
		this.answer = DB_Connector.request("SELECT * FROM tbl_user WHERE username = " + userName + " AND password = " + passWord);
		if (this.answer == ""){
			
			// error message
			JOptionPane.showMessageDialog(null, "Login failed! Wrong Username or Password", "Error", JOptionPane.OK_CANCEL_OPTION);
			
		} else {
			StringTokenizer st = new StringTokenizer(answer, ",");
			userName = st.nextToken();
			passWord = st.nextToken();
			firstName = st.nextToken();
			lastName = st.nextToken();
			dateOfBirth = st.nextToken();
			this.currentUser = new User(userName, passWord, firstName, lastName, dateOfBirth);
			// Open EventList
			GuiController.EventListstarter();
			
		}
	}

}
