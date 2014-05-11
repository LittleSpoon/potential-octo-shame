package com.supinfo.client.view.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class windowCreateTask extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					windowCreateTask frame = new windowCreateTask();
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
	public windowCreateTask() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewName = new JLabel("Name : ");
		lblNewName.setBounds(6, 6, 48, 16);
		contentPane.add(lblNewName);
		
		textField = new JTextField();
		textField.setBounds(66, 0, 207, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		//Label begin date
		JLabel lblBeginDate = new JLabel("Beginning Date :");
		lblBeginDate.setBounds(6, 34, 109, 16);
		contentPane.add(lblBeginDate);
				
		//label end date				
		JLabel lblEndDate = new JLabel("Ending Date :");
		lblEndDate.setBounds(247, 34, 90, 16);
		contentPane.add(lblEndDate);
		
		JLabel lblRqtDateEnd = new JLabel("");
		lblRqtDateEnd.setBounds(331, 34, 101, 16);
		contentPane.add(lblRqtDateEnd);
		
		JLabel lblRqtDateBegin = new JLabel("");
		lblRqtDateBegin.setBounds(114, 34, 109, 16);
		contentPane.add(lblRqtDateBegin);
		
		JButton btnEmployeeInvite = new JButton("Employee to invite");
		btnEmployeeInvite.setBounds(6, 62, 148, 29);
		contentPane.add(btnEmployeeInvite);
		
		JLabel lblEmployeeAdded = new JLabel("");
		lblEmployeeAdded.setBounds(166, 67, 266, 16);
		contentPane.add(lblEmployeeAdded);
	}
}
