package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JRadioButton;

import bl.GuiController;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		
		JComboBox comboBox = new JComboBox();
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
		
		JRadioButton rdbtnNone = new JRadioButton("None");
		rdbtnNone.setBounds(45, 294, 109, 23);
		frame.getContentPane().add(rdbtnNone);
		
		JRadioButton rdbtnYes = new JRadioButton("Yes");
		rdbtnYes.setBounds(45, 320, 46, 23);
		frame.getContentPane().add(rdbtnYes);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(99, 324, 60, 20);
		frame.getContentPane().add(comboBox_1);
		
		JButton btnCreate = new JButton("Create");
		btnCreate.setBounds(45, 379, 89, 23);
		frame.getContentPane().add(btnCreate);
		
		JButton btnDiscard = new JButton("Discard");
		btnDiscard.setBounds(196, 379, 89, 23);
		frame.getContentPane().add(btnDiscard);
		
		JLabel lblLoggedInAs = new JLabel("Logged in as: --");
		lblLoggedInAs.setBounds(494, 11, 79, 14);
		frame.getContentPane().add(lblLoggedInAs);
	}
}
