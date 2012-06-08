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

	public TableModelEvent(String filterart, String filterwert) {
		list = es.listEvent(filterart, filterwert);
	}

	@Override
	public int getColumnCount() {
		return 3;
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
		}
		return null;
	}

}

