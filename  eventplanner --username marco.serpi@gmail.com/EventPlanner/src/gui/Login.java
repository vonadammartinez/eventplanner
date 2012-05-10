package gui;

import java.awt.EventQueue;

public class Login {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextPane txtpnPassword;
	private String userName;
	private String passWord;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public Login() {

		initialize();
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
		textField.setBounds(195, 54, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(195, 85, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userName = textField.getText();
				String passWord = textField_1.getText();
				
				if(userName.equals("")|| passWord.equals("")){
					JOptionPane.showMessageDialog(null,"Bitte alle Felder ausfüllen", "FAIL!!",JOptionPane.OK_CANCEL_OPTION);
				}else{
				
				UserSession us = new UserSession(userName, passWord);
				}
			}
		});
		btnLogin.setBounds(195, 131, 89, 23);
		frame.getContentPane().add(btnLogin);

		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GuiController.Registerstarter();
				frame.dispose();
			}
		});
		btnRegister.setBounds(195, 161, 89, 23);
		frame.getContentPane().add(btnRegister);

		JTextPane txtpnUsername = new JTextPane();
		txtpnUsername.setEditable(false);
		txtpnUsername.setBackground(SystemColor.control);
		txtpnUsername.setText("Username:");
		txtpnUsername.setBounds(104, 54, 86, 20);
		frame.getContentPane().add(txtpnUsername);

		txtpnPassword = new JTextPane();
		txtpnPassword.setEditable(false);
		txtpnPassword.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtpnPassword.setBackground(SystemColor.control);
		txtpnPassword.setText("Password:");
		txtpnPassword.setBounds(104, 85, 86, 20);
		frame.getContentPane().add(txtpnPassword);
	}
}

