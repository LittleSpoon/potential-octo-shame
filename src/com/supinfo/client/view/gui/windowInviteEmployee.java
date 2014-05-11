package com.supinfo.client.view.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JEditorPane;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class windowInviteEmployee extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					windowInviteEmployee frame = new windowInviteEmployee();
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
	public windowInviteEmployee() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 100);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEmployeeInvite = new JLabel("Employee to invite :");
		lblEmployeeInvite.setBounds(6, 6, 129, 16);
		contentPane.add(lblEmployeeInvite);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(147, 2, 216, 27);
		contentPane.add(comboBox);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(327, 34, 117, 29);
		contentPane.add(btnAdd);
	}
}
