package gui;

import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
	private String Username;
	private String Password;
	private String DateOfBirth;
	private String FirstName;
	private String LastName;

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
				
				/**if (userName == null || passWord == null || firstName == null || lastName == null || dateOfBirth == null){
					
					JOptionPane.showMessageDialog(null, "Bitte alle Felder ausfüllen", "FAIL!!", JOptionPane.OK_CANCEL_OPTION);
					
				}else{
// Hier kommt noch der Code für die weitere Verwendung der Strings
				
			
				
				
				}**/
			}
		});
		btnRegister.setBounds(176, 213, 89, 23);
		frame.getContentPane().add(btnRegister);

		txtpnUsername = new JTextPane();
		txtpnUsername.setBackground(SystemColor.control);
		txtpnUsername.setText("Username:");
		txtpnUsername.setBounds(96, 50, 72, 20);
		frame.getContentPane().add(txtpnUsername);

		textPane_1 = new JTextPane();
		textPane_1.setBackground(SystemColor.control);
		textPane_1.setText("Password:");
		textPane_1.setBounds(96, 81, 72, 20);
		frame.getContentPane().add(textPane_1);

		textPane_2 = new JTextPane();
		textPane_2.setBackground(SystemColor.control);
		textPane_2.setText("First name:");
		textPane_2.setBounds(96, 112, 72, 20);
		frame.getContentPane().add(textPane_2);

		textPane_3 = new JTextPane();
		textPane_3.setBackground(SystemColor.control);
		textPane_3.setText("Last name:");
		textPane_3.setBounds(96, 143, 72, 20);
		frame.getContentPane().add(textPane_3);

		textPane = new JTextPane();
		textPane.setBackground(SystemColor.control);
		textPane.setText("Date of birth:");
		textPane.setBounds(96, 174, 72, 20);
		frame.getContentPane().add(textPane);
	}

}
