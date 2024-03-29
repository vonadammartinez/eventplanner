package bl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import db.EventDAO;

import model.Event;
import model.Location;
import model.User;

public class EventSession {

	private EventDAO edao = new EventDAO();

	public Event createEvent(String name, String date, Location location,
			String ageRestriction) {
		return edao.create(name, UserSession.getInstance().getCurrentUser(), date,
				location, ageRestriction);
	}

	public ArrayList<Event> listEvent(String filter, String filter1, String filter2) {
		return edao.list(filter, filter1, filter2);
	}

	public void participate(String eventName, int ageRestriction)
			throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		long days;
		Date today = new Date();
		Date birthDate = dateFormat.parse(UserSession.getInstance()
				.getCurrentUser().getDateOfBirth());
		days = (today.getTime() - birthDate.getTime()) / (24 * 60 * 60 * 1000);
		if (days > ageRestriction) {
			edao.participate(UserSession.getInstance().getCurrentUser()
					.getUserName(), eventName, ageRestriction);
		} else {
			return;
		}
	}
}
