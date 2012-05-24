package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import bl.EventSession;
import bl.GuiController;

public class CreateEvent {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public CreateEvent() {

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

		JLabel lblCreateNewEvent = new JLabel("Create new event:");
		lblCreateNewEvent.setBounds(10, 11, 114, 14);
		frame.getContentPane().add(lblCreateNewEvent);

		JLabel lblName = new JLabel("Name: ");
		lblName.setBounds(45, 60, 46, 14);
		frame.getContentPane().add(lblName);

		textField = new JTextField();
		textField.setBounds(45, 85, 240, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblLocation = new JLabel("Location: ");
		lblLocation.setBounds(45, 130, 79, 14);
		frame.getContentPane().add(lblLocation);

		final JComboBox comboBox = new JComboBox();
		comboBox.setBounds(45, 155, 240, 20);
		frame.getContentPane().add(comboBox);

		JButton btnRegisterNewLocation = new JButton("Register new Location");
		btnRegisterNewLocation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GuiController.Locationstarter();
			}
		});
		btnRegisterNewLocation.setBounds(330, 154, 174, 23);
		frame.getContentPane().add(btnRegisterNewLocation);

		JLabel lblDate = new JLabel("Date: ");
		lblDate.setBounds(45, 202, 46, 14);
		frame.getContentPane().add(lblDate);

		textField_1 = new JTextField();
		textField_1.setBounds(45, 227, 240, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JLabel lblAgeRestriction = new JLabel("Age restriction: ");
		lblAgeRestriction.setBounds(45, 273, 114, 14);
		frame.getContentPane().add(lblAgeRestriction);

		final JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"0", "16", "18", "21", "30"}));
		comboBox_1.setToolTipText("");
		comboBox_1.setBounds(45, 298, 60, 20);
		frame.getContentPane().add(comboBox_1);

		JButton btnCreate = new JButton("Create");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textField.getText();
				String date = textField_1.getText();
				//Location location = comboBox.getSelectedItem(Location);
				 int ageRestriction = comboBox_1.getSelectedIndex();
				 
				
				
				
				if (name.equals("") || date.equals("")){
					
					  JOptionPane.showMessageDialog(null,"Please fill in all required fields", "Error!",JOptionPane.OK_CANCEL_OPTION);
				}else{
							EventSession es = new EventSession();
							//es.createEvent(name, date, location, ageRestriction);
							//System.out.println("do man : " + ageRestriction);
					
				}
				
			}
		});
		btnCreate.setBounds(45, 379, 89, 23);
		frame.getContentPane().add(btnCreate);

		JButton btnDiscard = new JButton("Discard");
		btnDiscard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GuiController.EventListstarter();
				frame.dispose();
			}
		});
		btnDiscard.setBounds(196, 379, 89, 23);
		frame.getContentPane().add(btnDiscard);

		JLabel lblLoggedInAs = new JLabel("Logged in as:--");
		lblLoggedInAs.setBounds(494, 11, 79, 14);
		frame.getContentPane().add(lblLoggedInAs);
	}
}
