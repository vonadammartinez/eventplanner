package bl;

import java.util.HashMap;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;

import db.DB_Connector;
import db.UserDAO;

import model.User;
import gui.*;

public final class UserSession {

	private User currentUser;
	private static UserSession instance = null;

	
	private UserDAO udao = new UserDAO();

	private UserSession(){
		
	}
	
	public void login(String userName, String passWord){
		currentUser = udao.login(userName, passWord);
	}
	
	public void Registration(User u){
		
		
		/*if (){
			JOptionPane.showMessageDialog(null,"Registration failed! User or UserName already exists", "Error",JOptionPane.OK_CANCEL_OPTION);

			
		}else{
			
			
		}
		
		*/
	}
	public static UserSession getInstance() {
		if (instance == null){
			instance = new UserSession();
			
		} 
		return instance;
		
		
	}
	

}
