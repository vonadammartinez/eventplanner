package gui;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import bl.EventSession;

import model.Event;
import model.Location;
import model.User;
// Do söll schins denn s ganze model entsoh mit de date vom event so dass mrs im gui azeige chöi 
public class TableModelEvent extends AbstractTableModel {
	
	ArrayList<Event> list = new ArrayList<Event>();
	EventSession es = new EventSession();

	public TableModelEvent(String filter, String filter1, String filter2) {
		list = es.listEvent(filter, filter1, filter2);
	}

	@Override
	public int getColumnCount() {
		return 4;
	}

	@Override
	public int getRowCount() {
		return list.size();
	}
	
	public Event getObjectbyIndex(int i){
		return list.get(i);
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Event e2 = list.get(rowIndex);
		if(columnIndex == 0) {
			return e2.getName();
		} else if (columnIndex == 1){
			return e2.getLocation().getName();
		} else if (columnIndex == 2){
			return e2.getDate();
		} else if (columnIndex == 3){
			return e2.getOrganisator().getUserName();
		}
		return null;
	}

}

