package gui;

import java.util.ArrayList;

import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

import model.Event;
import model.Location;

import bl.EventSession;

import bl.LocationSession;



public class ComboboxModel  extends AbstractListModel implements ComboBoxModel {
	
	
	/**
	 * Diese Klasse ist dafür zuständig die nötigen Werte für die Combobox
	 * zu verfügung zu stellen.
	 */
	
	
	
	
	private static final long serialVersionUID = 1L;
	

	ArrayList<Location> list = new ArrayList<Location>();
	LocationSession ls = new LocationSession();
	
	Location location;
	
	public ComboboxModel (){
		list = ls.getLocations();
	}
	@Override
	public Object getElementAt(int index) {
		
		return list.get(index);
	}

	@Override
	public int getSize() {
		return list.size();
	}

	@Override
	public Object getSelectedItem() {
		

		return location;
	}

	@Override
	public void setSelectedItem(Object selectedlocation) {

		location = (Location)selectedlocation;
		
	}

}
