package gui;

import java.util.ArrayList;

import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

import model.Event;

import bl.EventSession;

import bl.LocationSession;



public class ComboboxModel  extends AbstractListModel implements ComboBoxModel {
	
	
	/**
	 * Diese Klasse ist daf�r zust�ndig die n�tigen Werte f�r die Combobox
	 * zu verf�gung zu stellen.
	 */
	
	
	private static final long serialVersionUID = 1L;
	

	ArrayList<LocationSession> list = new ArrayList<LocationSession>();
	LocationSession ls = new LocationSession();
	
	Location location;
	
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
