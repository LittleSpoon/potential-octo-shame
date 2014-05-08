package com.supinfo.client.model;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;



public class Task {
	private String taskName;
	private GregorianCalendar taskStartDate;
	private GregorianCalendar taskEndDate;
	private String taskAuthor;
	private String taskDescription;
	private Boolean isTaskFinished;
		
	public Task(){
		super();
		taskName = "TestName";
		taskStartDate= new GregorianCalendar(2014,07,05);
		taskEndDate= new GregorianCalendar(2014,07,14);
		taskAuthor = "Elepole";
		taskDescription = "Some task";
		isTaskFinished = true;		
	}
	
	@Override
	public String toString(){
		SimpleDateFormat date_format = new SimpleDateFormat("dd/mm/yyyy");
		
		//test isTaskFinished with a conditional, then return the appropriate string
		return isTaskFinished ? taskName+" by "+taskAuthor+" which does "+taskDescription+". It it start at "+date_format.format(taskStartDate.getTime())+" and end at "+date_format.format(taskEndDate.getTime())+" and is finished.": taskName+" by "+taskAuthor+" which does "+taskDescription+". It it start at "+date_format.format(taskStartDate.getTime())+" and end at "+date_format.format(taskEndDate.getTime())+" and is not finished.";
	}
	

}
