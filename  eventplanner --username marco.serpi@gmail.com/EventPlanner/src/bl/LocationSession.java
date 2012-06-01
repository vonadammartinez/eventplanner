package bl;

import db.LocationDAO;



public class LocationSession {
	
	
	private LocationDAO ldao = new LocationDAO();
	
	
	public void createLocation(String name, String place) {
		
		ldao.create(name, place);
		
	}
	
	public void getLocations(){
		ldao.getLocations();
	}
}
