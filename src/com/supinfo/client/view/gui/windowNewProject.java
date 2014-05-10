package com.supinfo.client.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;

public class windowNewProject extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					windowNewProject frame = new windowNewProject();
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
	public windowNewProject() {
		setTitle("New Project");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewName = new JLabel("Name :");
		lblNewName.setBounds(6, 6, 52, 16);
		contentPane.add(lblNewName);
		
		JLabel lblBeginDate = new JLabel("Beginning Date :");
		lblBeginDate.setBounds(6, 34, 109, 16);
		contentPane.add(lblBeginDate);
		
		textField = new JTextField();
		textField.setBounds(57, 0, 387, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblEndDate = new JLabel("Ending Date :");
		lblEndDate.setBounds(247, 34, 90, 16);
		contentPane.add(lblEndDate);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(116, 34, 119, 28);
		contentPane.add(dateChooser);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(349, 34, 119, 28);
		contentPane.add(dateChooser_1);
	}
}
