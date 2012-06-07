package gui;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import model.Event;
import model.Location;
import model.User;
// Do söll schins denn s ganze model entsoh mit de date vom event so dass mrs im gui azeige chöi 
public class TableModelEvent extends AbstractTableModel {
	
	ArrayList<Event> list = new ArrayList<Event>();
	User u = new User("test", "test", "test", "test", "1991.07.30");
	Location l = new Location("testloc", "testplace");
	Event e = new Event("test", u, "2012.06.06", l, 18);

	public TableModelEvent() {
		list.add(e);
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

