package com.notwebschedules.NotWebSchedulesAPI.models.schedule.oncall;

public enum SetCallShifts {
	
	DAYS_0700_1500(7.0, 15.0, 8, false, false, false, false),
	DAYS_0700_1500B(7.0, 15.0, 8, true, false, false, false),
	DAYS_0700_1500H(7.0, 15.0, 8, false, false, true, false),
	DAYS_0700_1500HB(7.0, 15.0, 8, true, false, true, false),
	DAYS_0700_1500N(7.0, 15.0, 8, false, false, false, true),
	DAYS_0700_1500T(7.0, 15.0, 8, false, true, false, false),
	AFTERNOONS_1500_1900(15.0, 19.0, 4, false, false, false, false),
	AFTERNOONS_1500_2300(15.0, 23.0, 8, false, false, false, false),
	AFTERNOONS_1500_2300B(15.0, 23.0, 8, true, false, false, false),
	AFTERNOONS_1500_2300H(15.0, 23.0, 8, false, false, true, false),
	AFTERNOONS_1500_2300HB(15.0, 23.0, 8, true, false, true, false),
	AFTERNOONS_1500_2300N(15.0, 23.0, 8, false, false, false, true),
	AFTERNOONS_1500_2300T(15.0, 23.0, 8, false, true, false, false),
	AFTERNOONS_1900_2300(19.0, 23.0, 4, false, false, false, false),
	MIDNIGHTS_2300_0700(23.0, 7.0, 8, false, false, false, false),
	MIDNIGHTS_2300_0700B(23.0, 7.0, 8, true, false, false, false),
	MIDNIGHTS_2300_0700H(23.0, 7.0, 8, false, false, true, false),
	MIDNIGHTS_2300_0700HB(23.0, 7.0, 8, true, false, true, false),
	MIDNIGHTS_2300_0700N(23.0, 7.0, 8, false, false, false, true),
	MIDNIGHTS_2300_0700T(23.0, 7.0, 8, false, true, false, false);
	
	private double startTime;
	private double endTime;
	private double shiftLength;
	private boolean backup;
	private boolean trauma;
	private boolean hearts;
	private boolean neuro;
	
	SetCallShifts(double startTime, double endTime, double shiftLength, 
			boolean backup, boolean trauma, boolean hearts, boolean neuro) {
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

	public double getEndTime() {
		return endTime;
	}

	public double getShiftLength() {
		return shiftLength;
	}
	
	public boolean isBackup() {
		return backup;
	}
	
	public boolean isTrauma() {
		return trauma;
	}

	public boolean isHearts() {
		return hearts;
	}

	public boolean isNeuro() {
		return neuro;
	}

}
