package com.notwebschedules.NotWebSchedulesAPI.repos;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.notwebschedules.NotWebSchedulesAPI.models.schedule.SingleDaySchedule;

public interface ScheduleRepository extends MongoRepository<SingleDaySchedule, String>{

	
}
