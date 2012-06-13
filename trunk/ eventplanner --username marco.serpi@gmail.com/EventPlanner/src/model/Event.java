package model;
import model.User;

public class Event {
	private String name;
	private User organisator;
	private String date;
	private Location location;
	private int ageRestriction;

	
	public Event(String name, User organisator, String date, Location location, int ageRestriction){
		this.name = name;
		this.organisator = organisator;
		this.date = date;
		this.location = location;
		this.ageRestriction = ageRestriction;
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User getOrganisator() {
		return organisator;
	}

	public void setOrganisator(User organisator) {
		this.organisator = organisator;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public int getAgeRestriction() {
		return ageRestriction;
	}

	public void setAgeRestriction(int ageRestriction) {
		this.ageRestriction = ageRestriction;
	}

	


	

}
