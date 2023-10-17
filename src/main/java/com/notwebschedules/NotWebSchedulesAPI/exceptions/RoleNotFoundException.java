package com.notwebschedules.NotWebSchedulesAPI.exceptions;

public class RoleNotFoundException extends IllegalArgumentException {

	private static final long serialVersionUID = 1L;
	
	public RoleNotFoundException(String role) {
		super(role + " not found.");
	}
}