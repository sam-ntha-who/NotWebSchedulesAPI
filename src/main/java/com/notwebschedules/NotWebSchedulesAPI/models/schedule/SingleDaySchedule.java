package com.notwebschedules.NotWebSchedulesAPI.models.schedule;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.notwebschedules.NotWebSchedulesAPI.models.staff.Staff;

@Document("Schedule")
public class SingleDaySchedule {

	@Id
	String date;
	Staff staff;
	Shift shift;
	
	public SingleDaySchedule() {
		
	}
	
	public SingleDaySchedule(Staff staff, Shift shift, String date) {
		this.staff = staff;
		this.shift = shift;
		this.date = date;
	}

	public Shift getShift() {
		return shift;
	}

	public void setShift(Shift shift) {
		this.shift = shift;
	}

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}
	

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

			
}
