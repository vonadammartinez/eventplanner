package db;

import java.util.ArrayList;
import java.util.StringTokenizer;

import model.Event;
import model.Location;
import model.User;

public class EventDAO {

	private String answer;
	private String locID;
	private String eventID;
	private ArrayList<Event> a = new ArrayList<Event>();

	public Event create(String name, User organisator, String date,
			Location location, int ageRestriction) {
		answer = DB_Connector
				.request("SELECT name FROM tbl_event WHERE location = '"
						+ location.getName() + "' AND date = '" + date + "'");
		locID = DB_Connector
				.request("SELECT idtbl_location FROM tbl_location WHERE Name = '"
						+ location.getName() + "'");
		if (answer == null) {
			DB_Connector
					.request2("INSERT INTO tbl_event (name, tbl_user_username, date, tbl_location_idtbl_location, agerestriction) VALUES('"
							+ name
							+ "', '"
							+ organisator
							+ "', '"
							+ date
							+ "', '" + locID + "', " + ageRestriction + "')");
			return new Event(name, organisator, date, location, ageRestriction);

		} else {
			return null;
		}
	}

	public ArrayList<Event> list(String filterart, String filterwert) {

		answer = DB_Connector.request("SELECT * FROM tbl_event WHERE "
				+ filterart + " = '" + filterwert + "'");

		String name;
		String username;
		String date;
		String locID;
		int ageRestriction;
		
		String password;
		String firstName;
		String lastName;
		String dateOfBirth;
		
		String locName;
		String locPlace;
		
		String cache;
		
		ArrayList<Event> eventList = new ArrayList<Event>();

		StringTokenizer st = new StringTokenizer(answer, "\n");

		while (st.hasMoreTokens()) {
			String zeile = st.nextToken();
			StringTokenizer st2 = new StringTokenizer(zeile, ",");
			st2.nextToken();
			name = st2.nextToken();
			username = st2.nextToken();
			cache = DB_Connector.request("SELECT * FROM tbl_user WHERE username = '" + username + "'");
			StringTokenizer st3 = new StringTokenizer(cache);
			st3.nextToken();
			password = st3.nextToken();
			firstName = st3.nextToken();
			lastName = st3.nextToken();
			dateOfBirth = st3.nextToken();
			User u = new User(username, password, firstName, lastName, dateOfBirth);
			date = st2.nextToken();
			locID = st2.nextToken();
			cache = DB_Connector.request("Select * FROM tbl_location WHERE idtbl_location = '" + locID + "'");
			StringTokenizer st4 = new StringTokenizer(cache);
			st4.nextToken();
			locName = st4.nextToken();
			locPlace = st4.nextToken();
			Location l = new Location(locName, locPlace);
			ageRestriction = Integer.parseInt(st2.nextToken());
			
			eventList.add(new Event(name, u, date, l, ageRestriction));

		}

		return eventList;
	}

	public boolean participate(String userName, String eventName,
			int ageRestriction) {
		eventID = DB_Connector
				.request("SELECT id_event FROM tbl_event WHERE name = '"
						+ eventName + "'");

		answer = DB_Connector
				.request("SELECT * FROM tbl_registration WHERE tbl_user_username = '"
						+ userName
						+ "' AND tbl_event_id_event = '"
						+ eventID
						+ "'");

		if (answer == null) {
			DB_Connector
					.request2("INSERT INTO tbl_registration (tbl_user_username, tbl_event_id_event) VALUES('"
							+ userName + "', '" + eventID + ")");
			return true;
		} else {

			return false;
		}
	}
}
