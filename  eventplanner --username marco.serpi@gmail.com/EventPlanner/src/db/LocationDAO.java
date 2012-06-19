package db;

import java.util.ArrayList;
import java.util.StringTokenizer;

import model.Location;

public class LocationDAO {
	private String answer;

	public Location create(String name, String place) {
		answer = DB_Connector
				.request("SELECT * FROM tbl_location WHERE Name = '" + name
						+ "' AND Place = '" + place + "'");

		if (answer == "") {
			DB_Connector
					.request2("INSERT INTO tbl_location (Name, Place) VALUES ('"
							+ name + "', '" + place + "')");
			Location l = new Location(name, place);
			return l;
		} else {
			return null;
		}

	}

	public ArrayList<Location> getLocations() {
		answer = DB_Connector.request("SELECT * FROM tbl_location");
		String name;
		String place;
		ArrayList<Location> locList = new ArrayList<Location>();

		StringTokenizer st = new StringTokenizer(answer, "\n");

		while (st.hasMoreTokens()) {
			String zeile = st.nextToken();
			StringTokenizer st2 = new StringTokenizer(zeile, ",");
			st2.nextToken();
			name = st2.nextToken();
			place = st2.nextToken();
			Location loc = new Location(name, place);
			locList.add(loc);
		}

		return locList;
	}
}
