package model;

public class Location {
	private String name;
	private String place;
	
	public Location(String name, String place){
		this.name = name;
		this.place = place;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}
	
	public String toString(){
		return this.getName();
	}
}
