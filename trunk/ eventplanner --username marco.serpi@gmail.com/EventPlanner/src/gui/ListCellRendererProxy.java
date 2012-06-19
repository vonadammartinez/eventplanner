package gui;

import java.awt.Component;

import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class ListCellRendererProxy implements ListCellRenderer {
	private final ListCellRenderer delegate;

	public ListCellRendererProxy(ListCellRenderer delegate) {
		this.delegate = delegate;
	}

	@Override
	public Component getListCellRendererComponent(JList list, Object value,
			int index, boolean isSelected, boolean cellHasFocus) {
		value = ((model.Location) value).getName();

		return delegate.getListCellRendererComponent(list, value, index,
				isSelected, cellHasFocus);
	}
}
