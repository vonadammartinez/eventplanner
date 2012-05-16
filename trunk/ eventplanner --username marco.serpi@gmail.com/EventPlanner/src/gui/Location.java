package gui;

import java.awt.SystemColor;

import javax.swing.*;

public class Location {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public Location() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setBounds(178, 79, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(178, 108, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JButton btnRegister = new JButton("Register");
		btnRegister.setBounds(176, 145, 89, 23);
		frame.getContentPane().add(btnRegister);

		JTextPane txtpnName = new JTextPane();
		txtpnName.setEditable(false);
		txtpnName.setBackground(SystemColor.control);
		txtpnName.setText("Name:");
		txtpnName.setBounds(113, 79, 55, 20);
		frame.getContentPane().add(txtpnName);

		JTextPane txtpnPlace = new JTextPane();
		txtpnPlace.setEditable(false);
		txtpnPlace.setBackground(SystemColor.control);
		txtpnPlace.setText("Place:");
		txtpnPlace.setBounds(113, 108, 55, 20);
		frame.getContentPane().add(txtpnPlace);
	}
}
