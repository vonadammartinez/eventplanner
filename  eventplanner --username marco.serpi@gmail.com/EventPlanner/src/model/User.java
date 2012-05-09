package model;

public class User {
	private String userName;//server
	private String password;
	private String lastName;
	private String firstName;
	private String dateOfBirth;

	public User(String userName, String password, String lastName, String firstName, String dateOfBirth){
		 this.userName = userName;
		 this.password = password;
		 this.lastName = lastName;
		 this.firstName = firstName;
		 this.dateOfBirth = dateOfBirth;
		 	 
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	




	
	
}
