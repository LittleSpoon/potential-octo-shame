package com.supinfo.client.model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Converter {
	
	private String date;

	public  Converter() throws ParseException{
	DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
	Calendar cal  = Calendar.getInstance(); 
	date = "23.04.23";
	System.out.println(date);
	}
}
