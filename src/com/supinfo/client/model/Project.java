package com.supinfo.client.model;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Project {
	
	private String projectName;
	private int projectCompletion;
	private GregorianCalendar projectStartDate;
	private GregorianCalendar projectEndDate;
	private ArrayList<Task> projectTasks;
	private ArrayList<String> projectEmployees;
	
	public Project(){
		projectName = "Something";
		projectCompletion = 1;
		projectStartDate = new GregorianCalendar(2014,07,05);
		projectEndDate = new GregorianCalendar(2014,07,14);
		projectTasks = new ArrayList<>();
		projectEmployees = new ArrayList<>();	
	}

}
