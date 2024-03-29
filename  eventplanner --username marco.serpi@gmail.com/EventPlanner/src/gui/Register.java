package gui;

import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


import bl.GuiController;
import bl.UserSession;

public class Register {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextPane txtpnUsername;
	private JTextPane textPane_1;
	private JTextPane textPane_2;
	private JTextPane textPane_3;
	private JTextPane textPane;
	


	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public Register() {

		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.getContentPane().setBackground(SystemColor.control);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JTextPane txtpnPleaseEnterYour = new JTextPane();
		txtpnPleaseEnterYour.setEditable(false);
		txtpnPleaseEnterYour.setBackground(SystemColor.control);
		txtpnPleaseEnterYour
				.setText("Please enter your personal information below");
		txtpnPleaseEnterYour.setBounds(10, 11, 137, 34);
		frame.getContentPane().add(txtpnPleaseEnterYour);

		textField = new JTextField();
		textField.setBounds(178, 50, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(178, 81, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(178, 112, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBounds(178, 143, 86, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setBounds(178, 174, 86, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);

		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userName = textField.getText();
				String passWord = textField_1.getText();
				String firstName = textField_2.getText();
				String lastName = textField_3.getText();
				String dateOfBirth = textField_4.getText();

				
				  if (userName.equals("") || passWord.equals("") || firstName.equals("") || lastName.equals("") || dateOfBirth.equals("")){
					  
				  JOptionPane.showMessageDialog(null,"Please fill in all required fields", "Error!",JOptionPane.OK_CANCEL_OPTION);
				  
				 }else{ UserSession.getInstance().Registration(userName, passWord, firstName, lastName, dateOfBirth);
					 
					 
					 GuiController.Loginstarter();
					 
					 
					 frame.dispose();
					 
				 }
				 
			}
		});
		btnRegister.setBounds(176, 213, 89, 23);
		frame.getContentPane().add(btnRegister);

		txtpnUsername = new JTextPane();
		txtpnUsername.setEditable(false);
		txtpnUsername.setBackground(SystemColor.control);
		txtpnUsername.setText("Username:");
		txtpnUsername.setBounds(96, 50, 72, 20);
		frame.getContentPane().add(txtpnUsername);

		textPane_1 = new JTextPane();
		textPane_1.setEditable(false);
		textPane_1.setBackground(SystemColor.control);
		textPane_1.setText("Password:");
		textPane_1.setBounds(96, 81, 72, 20);
		frame.getContentPane().add(textPane_1);

		textPane_2 = new JTextPane();
		textPane_2.setEditable(false);
		textPane_2.setBackground(SystemColor.control);
		textPane_2.setText("First name:");
		textPane_2.setBounds(96, 112, 72, 20);
		frame.getContentPane().add(textPane_2);

		textPane_3 = new JTextPane();
		textPane_3.setEditable(false);
		textPane_3.setBackground(SystemColor.control);
		textPane_3.setText("Last name:");
		textPane_3.setBounds(96, 143, 72, 20);
		frame.getContentPane().add(textPane_3);

		textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setBackground(SystemColor.control);
		textPane.setText("Date of birth:");
		textPane.setBounds(96, 174, 80, 20);
		frame.getContentPane().add(textPane);
		
		JTextPane txtpnYmd = new JTextPane();
		txtpnYmd.setBackground(SystemColor.control);
		txtpnYmd.setEditable(false);
		txtpnYmd.setText("yyyy.mm.dd (1989.06.15)");
		txtpnYmd.setBounds(274, 174, 150, 20);
		frame.getContentPane().add(txtpnYmd);
	}
}

