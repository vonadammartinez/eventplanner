package db;



import model.Event;
import model.Location;
import model.User;

public class EventDAO {

	

	private String answer;
	private String locID;

	public Event create(String name, User organisator, String date, Location location, int ageRestriction) {
		answer = DB_Connector
				.request("SELECT name FROM tbl_event WHERE location = '"
						+ location.getName() + "' AND date = '" + date + "'");
		locID = DB_Connector
				.request("SELECT idtbl_location FROM tbl_location WHERE Name = '"
						+ location.getName() + "'");
		if (answer == null) {
			answer = DB_Connector
					.request("INSERT INTO tbl_event (name, tbl_user_username, date, tbl_location_idtbl_location, agerestriction) VALUES('"
							+ name
							+ "', '"
							+ organisator
							+ "', '"
							+ date
							+ "', '"
							+ locID + "', " + ageRestriction + ")");
			Event e = new Event(name, organisator, date, location, ageRestriction);
			return e;
		} else {
			return null;
		}
	}
}
