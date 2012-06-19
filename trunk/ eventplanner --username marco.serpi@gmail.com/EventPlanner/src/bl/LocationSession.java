package bl;

import java.util.ArrayList;

import model.Location;
import db.LocationDAO;



public class LocationSession {
	
	
	private LocationDAO ldao = new LocationDAO();
	
	
	public Location createLocation(String name, String place) {
		
		return ldao.create(name, place);
		
	}
	
	public ArrayList<Location> getLocations(){
		return ldao.getLocations();
	}
}
