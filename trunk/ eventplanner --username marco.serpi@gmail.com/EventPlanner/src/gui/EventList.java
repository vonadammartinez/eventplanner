package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import bl.EventSession;
import bl.GuiController;
import bl.UserSession;

import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import model.Event;

public class EventList {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public EventList() {

		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("EventPlanner");
		frame.setVisible(true);
		frame.setBounds(100, 100, 640, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblFilter = new JLabel("Filter");
		lblFilter.setBounds(491, 29, 95, 23);
		frame.getContentPane().add(lblFilter);

		JLabel lblName = new JLabel("Name");
		lblName.setBounds(491, 63, 46, 14);
		frame.getContentPane().add(lblName);

		textField = new JTextField("");
		textField.setBounds(491, 88, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblLocation = new JLabel("Location");
		lblLocation.setBounds(491, 130, 46, 14);
		frame.getContentPane().add(lblLocation);

		textField_1 = new JTextField("");
		textField_1.setBounds(491, 155, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JLabel lblDate = new JLabel("Date");
		lblDate.setBounds(491, 200, 46, 14);
		frame.getContentPane().add(lblDate);

		textField_2 = new JTextField("");
		textField_2.setBounds(491, 225, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);

		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(491, 278, 95, 23);
		frame.getContentPane().add(btnSearch);

		JLabel lblEvents = new JLabel("Events");
		lblEvents.setBounds(29, 4, 46, 14);
		frame.getContentPane().add(lblEvents);

		JLabel lblSelectAnEvent = new JLabel(
				"Select an event and press participate or create your own event!");
		lblSelectAnEvent.setBounds(29, 358, 442, 14);
		frame.getContentPane().add(lblSelectAnEvent);

		JButton btnParticipate = new JButton("Participate");
		btnParticipate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = table_1.getSelectedRow();
				Event e2 = ((TableModelEvent)table_1.getModel()).getObjectbyIndex(i);
				EventSession es = new EventSession();
				try {
					es.participate(e2.getName(), e2.getAgeRestriction());
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		

		btnParticipate.setBounds(29, 388, 123, 23);
		frame.getContentPane().add(btnParticipate);

		JButton btnCreateNewEvent = new JButton("Create new event");
		btnCreateNewEvent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GuiController.CreateEventstarter();
				frame.dispose();
			}
		});
		btnCreateNewEvent.setBounds(187, 388, 148, 23);
		frame.getContentPane().add(btnCreateNewEvent);

		JLabel lblLoggedInAs = new JLabel("Logged in as: "
				+ UserSession.getInstance().getCurrentUser().getUserName());
		lblLoggedInAs.setBounds(431, 4, 155, 14);
		frame.getContentPane().add(lblLoggedInAs);

		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setBounds(491, 388, 89, 23);
		frame.getContentPane().add(btnClose);
		table_1 = new JTable();
		table_1.setModel(new TableModelEvent(textField.getText(), textField_1.getText(), textField_2.getText()));
		table_1.setBounds(29, 51, 442, 250);
		frame.getContentPane().add(table_1);
		
		JButton btnMyEvents = new JButton("My Events");
		btnMyEvents.setBounds(361, 388, 110, 23);
		frame.getContentPane().add(btnMyEvents);

	}
}
