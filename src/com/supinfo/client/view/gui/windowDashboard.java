package com.supinfo.client.view.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Panel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class windowDashboard extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					windowDashboard frame = new windowDashboard();
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
	public windowDashboard() {
		setTitle("Dashboard");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNameProjet = new JLabel("Name Projet :");
		lblNameProjet.setBounds(6, 6, 92, 16);
		contentPane.add(lblNameProjet);
		//Pour afficher les noms de projets faire : labelRqtNameProjet.setText(la requete SQL)
		
		JLabel lblRqtProjectsCompletion = new JLabel("Project completion :");
		lblRqtProjectsCompletion.setBounds(6, 34, 131, 16);
		contentPane.add(lblRqtProjectsCompletion);
		//Pour afficher les noms de projets faire : lblRqtProjectCompletion.setText(la requete SQL)
		
		JLabel lblNbEmployee = new JLabel("Number of employees :");
		lblNbEmployee.setBounds(6, 62, 148, 16);
		contentPane.add(lblNbEmployee);
		
		//lblDateBegin label date begin
		JLabel lblDateBegin = new JLabel("Date Begin :");
		lblDateBegin.setBounds(6, 90, 80, 16);
		contentPane.add(lblDateBegin);
		
		//lblDateEnd label date end
		JLabel lblDateEnd = new JLabel("Date End :");
		lblDateEnd.setBounds(220, 90, 70, 16);
		contentPane.add(lblDateEnd);
		
		//lblRqtNameProjet label name projet
		JLabel lblRqtNameProjet = new JLabel("");
		lblRqtNameProjet.setBounds(99, 6, 345, 16);
		contentPane.add(lblRqtNameProjet);
		
		//lblRqtProjectCompletion lbl project 
		JLabel lblRqtProjectCompletion = new JLabel("");
		lblRqtProjectCompletion.setBounds(149, 34, 295, 16);
		contentPane.add(lblRqtProjectCompletion);
		
		JLabel lblRqtNbEmployee = new JLabel("");
		lblRqtNbEmployee.setBounds(159, 62, 285, 16);
		contentPane.add(lblRqtNbEmployee);
		
		JLabel lblRqtDateEnd = new JLabel("");
		lblRqtDateEnd.setBounds(297, 90, 101, 16);
		contentPane.add(lblRqtDateEnd);
		
		JLabel lblRqtDateBegin = new JLabel("");
		lblRqtDateBegin.setBounds(99, 90, 109, 16);
		contentPane.add(lblRqtDateBegin);
		
		JButton btnEditManager = new JButton("Edit");
		btnEditManager.addActionListener(new ActionListener() {
			//Ajouter un if pour les droits Manager ou Employee 
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEditManager.setBounds(327, 136, 117, 29);
		contentPane.add(btnEditManager);
		
		JButton btnEndProject = new JButton("End Project");
		btnEndProject.setBounds(6, 136, 117, 29);
		contentPane.add(btnEndProject);
	}
}
