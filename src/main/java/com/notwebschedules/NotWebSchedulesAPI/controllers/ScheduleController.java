package com.notwebschedules.NotWebSchedulesAPI.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.notwebschedules.NotWebSchedulesAPI.models.schedule.SingleDaySchedule;
import com.notwebschedules.NotWebSchedulesAPI.repos.ScheduleRepository;

@RestController
public class ScheduleController {
	
	@Autowired
	private ScheduleRepository scheduleRepo;
	
	// create single day schedule (for 1 person right now)
		@PostMapping("/create-one-day-schedule")
		@ResponseStatus(HttpStatus.CREATED)
		public SingleDaySchedule addSchedule(SingleDaySchedule singleDaySchedule) {
			
			
			return scheduleRepo.insert(singleDaySchedule);
			
		}
		
		
	
}
