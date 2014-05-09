package com.supinfo.client.view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class windowRegister extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textEmail;
	private JLabel lblPassword;
	private JLabel lblConfirmed;
	private JPasswordField textPassword;
	private JPasswordField textConfirmed;
	private JButton btnRegister;
	private JButton btnCancel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					windowRegister frameRegister = new windowRegister();
					frameRegister.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public windowRegister() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 210);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Label Email
		JLabel lblEmail = new JLabel("E-mail :");
		lblEmail.setBounds(6, 12, 61, 16);
		contentPane.add(lblEmail);
		
		//Label Password
		lblPassword = new JLabel("Password :");
		lblPassword.setBounds(6, 40, 67, 16);
		contentPane.add(lblPassword);
		
		//Label confirmed
		lblConfirmed = new JLabel("Confirmed :");
		lblConfirmed.setBounds(6, 68, 74, 16);
		contentPane.add(lblConfirmed);
		
		//Label Role
		JLabel lblRole = new JLabel("Role :");
		lblRole.setBounds(6, 96, 61, 16);
		contentPane.add(lblRole);
		
		//Button Register
		btnRegister = new JButton("Register");
		btnRegister.setBounds(204, 156, 117, 29);
		contentPane.add(btnRegister);
		
		
		//Form Email
		textEmail = new JTextField();
		textEmail.setText("@supinfo.com");
		textEmail.setBounds(59, 6, 385, 28);
		contentPane.add(textEmail);
		textEmail.setColumns(10);
		
		//Form password
		textPassword = new JPasswordField();
		textPassword.setBounds(83, 34, 361, 28);
		contentPane.add(textPassword);
		
		//Form Confirmed
		textConfirmed = new JPasswordField();
		textConfirmed.setBounds(93, 62, 351, 28);
		contentPane.add(textConfirmed);
		
		//Combo box Role
		String[] roleStrings = { "Employee", "Manager"};
		JComboBox roleList = new JComboBox(roleStrings);
		roleList.setBounds(45, 96, 137, 27);
		contentPane.add(roleList);
		roleList.setSelectedIndex(2);
		
		btnCancel = new JButton("Cancel");
		btnCancel.setBounds(327, 156, 117, 29);
		contentPane.add(btnCancel);
		roleList.addActionListener((ActionListener) this);
		

	}
}
