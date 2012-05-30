package bl;

import db.EventDAO;

import model.Location;

public class EventSession {

	private EventDAO edao = new EventDAO();

	public void createEvent(String name, String date, Location location,
			int ageRestriction) {
		edao.create(name, UserSession.getInstance().getCurrentUser(), date,
				location, ageRestriction);
	}
	
	public void listEvent(String filterart, String filterwert){
		edao.list(filterart, filterwert);
	}
}
