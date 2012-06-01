package db;

import model.Location;

public class LocationDAO {
	private String answer;

	public Location create(String name, String place) {
		answer = DB_Connector
				.request("SELECT * FROM tbl_location WHERE Name = '" + name
						+ "' AND Place = '" + place + "'");

		if (answer == "") {
			DB_Connector
					.request("INSERT INTO tbl_location (Name, Place) VALUES ('"
							+ name + "', '" + place + "')");
			Location l = new Location(name, place);
			return l;
		} else {
			return null;
		}

	}

	public String getLocations() {
		answer = DB_Connector.request("SELECT Name, Place FROM tbl_location");
		return answer;
	}
}
