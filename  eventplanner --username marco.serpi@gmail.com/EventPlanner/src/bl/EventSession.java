package bl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import db.EventDAO;

import model.Location;
import model.User;

public class EventSession {

	private EventDAO edao = new EventDAO();

	public void createEvent(String name, String date, Location location,
			int ageRestriction) {
		edao.create(name, UserSession.getInstance().getCurrentUser(), date,
				location, ageRestriction);
	}

	public void listEvent(String filterart, String filterwert) {
		edao.list(filterart, filterwert);
	}

	public void participate(String eventName, int ageRestriction)
			throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/mm/dd");
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
