package db;

import model.User;
import bl.*;



public class UserDAO {
	
	public String answer;
	
	
	public User login(String userName, String passWord) {
		this.answer = DB_Connector.request("SELECT * FROM tbl_user WHERE username = " + userName+ " AND password = " + passWord);

		return null;

	}
	public User regCheck(String userName, String passWord, String firstName, String lastName, String dateOfBirth){
		this.answer = DB_Connector.request("SELECT * FROM tbl_user WHERE username = " + userName+ " AND password = " + passWord+ " AND firstName = " + firstName+ "AND lastName = " + lastName+ "AND dateOfBirth = " + dateOfBirth);
		return null;
	}
	public User registration(String userName, String passWord, String firstName, String lastName, String dateOfBirth){
		
		return null;
	}
}

