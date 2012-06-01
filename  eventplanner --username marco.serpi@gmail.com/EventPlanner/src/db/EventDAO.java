package db;

import java.util.ArrayList;

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
					.request("INSERT INTO tbl_event (name, tbl_user_username, date, tbl_location_idtbl_location, agerestriction) VALUES('"
							+ name
							+ "', '"
							+ organisator
							+ "', '"
							+ date
							+ "', '" + locID + "', " + ageRestriction + ")");
			Event e = new Event(name, organisator, date, location,
					ageRestriction);
			return e;
		} else {
			return null;
		}
	}

	public String list(String filterart, String filterwert) {

		answer = DB_Connector
				.request("SELECT EVENT.name, LOC.name, EVENT.date FROM tbl_event AS EVENT INNER JOIN tbl_location AS LOC WHERE"
						+ filterart + " = '" + filterwert + "'");

		return answer;
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
					.request("INSERT INTO tbl_registration (tbl_user_username, tbl_event_id_event) VALUES('"
							+ userName + "', '" + eventID + ")");
			return true;
		} else {

			return false;
		}
	}
}
