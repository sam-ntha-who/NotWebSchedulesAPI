package com.notwebschedules.NotWebSchedulesAPI.models.schedule.oncall;

public class CustomOnCallShift {
	
	private double startTime;
	private double endTime;
	private double shiftLength;
	private boolean backup;
	private boolean trauma;
	private boolean hearts;
	private boolean neuro;

	
	
	public CustomOnCallShift(double startTime, double endTime, double shiftLength, boolean backup, boolean trauma,
			boolean hearts, boolean neuro) {
		super();
		this.startTime = startTime;
		this.endTime = endTime;
		this.shiftLength = shiftLength;
		this.backup = backup;
		this.trauma = trauma;
		this.hearts = hearts;
		this.neuro = neuro;
	}
	public double getStartTime() {
		return startTime;
	}
	public void setStartTime(double startTime) {
		this.startTime = startTime;
	}
	public double getEndTime() {
		return endTime;
	}
	public void setEndTime(double endTime) {
		this.endTime = endTime;
	}
	public double getShiftLength() {
		return shiftLength;
	}
	public void setShiftLength(double shiftLength) {
		this.shiftLength = shiftLength;
	}
	public boolean isBackup() {
		return backup;
	}
	public void setBackup(boolean backup) {
		this.backup = backup;
	}
	public boolean isTrauma() {
		return trauma;
	}
	public void setTrauma(boolean trauma) {
		this.trauma = trauma;
	}
	public boolean isHearts() {
		return hearts;
	}
	public void setHearts(boolean hearts) {
		this.hearts = hearts;
	}
	public boolean isNeuro() {
		return neuro;
	}
	public void setNeuro(boolean neuro) {
		this.neuro = neuro;
	}

}
