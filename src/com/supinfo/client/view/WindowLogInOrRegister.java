package com.supinfo.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class WindowLogInOrRegister extends JFrame {

	private JPanel contentPane;
	private JPasswordField formPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowLogInOrRegister frame = new WindowLogInOrRegister();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public WindowLogInOrRegister() {
		setForeground(Color.BLUE);
		setTitle("Log In or Register");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 271, 245);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblId = new JLabel("ID :");
		lblId.setBounds(66, 12, 50, 15);
		contentPane.add(lblId);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setBounds(66, 67, 89, 15);
		contentPane.add(lblPassword);
		
		JLabel lblOr = new JLabel("or");
		lblOr.setBounds(198, 119, 42, 15);
		contentPane.add(lblOr);
		
		JFormattedTextField formID = new JFormattedTextField();
		formID.setBounds(66, 36, 117, 19);
		contentPane.add(formID);
		
		formPassword = new JPasswordField();
		formPassword.setBounds(66, 90, 106, 19);
		contentPane.add(formPassword);
		
		
		JButton btnLogIn = new JButton("Log in ");
		btnLogIn.setBounds(66, 121, 117, 25);
		contentPane.add(btnLogIn);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setBounds(66, 168, 117, 25);
		contentPane.add(btnRegister);
	}

}
