package com.supinfo.client.view.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class windowNewProject extends JFrame {

	private JPanel contentPane;
	private JTextField textNewName;

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
		setBounds(100, 100, 480, 118);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Label new name
		JLabel lblNewName = new JLabel("Name :");
		lblNewName.setBounds(6, 6, 52, 16);
		contentPane.add(lblNewName);
		
		//Label begin date 
		JLabel lblBeginDate = new JLabel("Beginning Date :");
		lblBeginDate.setBounds(6, 34, 109, 16);
		contentPane.add(lblBeginDate);
		
		//label end date
		JLabel lblEndDate = new JLabel("Ending Date :");
		lblEndDate.setBounds(247, 34, 90, 16);
		contentPane.add(lblEndDate);

		//label Rqt begin date
		JLabel lblRqtBeginDate = new JLabel("");
		lblRqtBeginDate.setBounds(114, 34, 121, 16);
		contentPane.add(lblRqtBeginDate);
		
		//label rqt end date
		JLabel lblRqtEndDate = new JLabel("");
		lblRqtEndDate.setBounds(335, 34, 139, 16);
		contentPane.add(lblRqtEndDate);
		
		//text new name
		textNewName = new JTextField();
		textNewName.setBounds(57, 0, 387, 28);
		contentPane.add(textNewName);
		textNewName.setColumns(10);
		
		//Button Cancel
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(345, 62, 117, 29);
		contentPane.add(btnCancel);
		
		//Button Confirm
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.setBounds(220, 62, 117, 29);
		contentPane.add(btnConfirm);
		
	}
}
