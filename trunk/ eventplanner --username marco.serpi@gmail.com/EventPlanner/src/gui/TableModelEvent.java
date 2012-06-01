package gui;

import javax.swing.table.AbstractTableModel;

import model.Event;

public class TableModelEvent extends AbstractTableModel {
	
	//ArrayList<Event> events = ...

	public TableModelEvent() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		Event e = event.get(rowIndex);
		if(columnIndex == 1) {
			return e.getName();
		}
		return null;
	}

}

