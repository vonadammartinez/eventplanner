package gui;

import java.awt.Component;
import java.util.ArrayList;

import javax.swing.JList;
import javax.swing.plaf.basic.BasicComboBoxRenderer;

import bl.LocationSession;

import model.Event;


public class ComboboxRenderer extends BasicComboBoxRenderer {

	/**
	 * Diese Klasse erstellt die Anzeige der Objecte für die Comboboxen 
	 */
	private static final long serialVersionUID = 1L;


	public Component getListCellRendererComponent(JList list, Object value,
			int index, boolean isselected, boolean selhasfokus) {
		// TODO Auto-generated method stub
		
		
		super.getListCellRendererComponent(list, value, index, isselected, selhasfokus);
		
		if(value != null && !value.equals(" ")){
			this.setText(((model.Location)value).getName());
		}
		
		return this;
	}
	
	

}
