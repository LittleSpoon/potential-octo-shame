package com.supinfo.exception;

public class PasswordHaveNotNumber extends PasswordInvalid {

	public PasswordHaveNotNumber() {
		// TODO Auto-generated constructor stub
	}

	public PasswordHaveNotNumber(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public PasswordHaveNotNumber(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public PasswordHaveNotNumber(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public PasswordHaveNotNumber(String arg0, Throwable arg1, boolean arg2,
			boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "The password need to have at least one number.";
	}

}
