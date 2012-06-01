package gui;

import javax.swing.table.AbstractTableModel;

import model.Event;
// Do söll schins denn s ganze model entsoh mit de date vom event so dass mrs im gui azeige chöi 
public class TableModelEvent extends AbstractTableModel {
	
	//ArrayList<Event> events = ...

	public TableModelEvent() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
//		Event e = event.get(rowIndex);
		//if(columnIndex == 1) {
			//return e.getName();
		//}
		return null;
	}

}

