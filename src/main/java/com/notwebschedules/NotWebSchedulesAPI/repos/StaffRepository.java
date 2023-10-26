package com.notwebschedules.NotWebSchedulesAPI.repos;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.notwebschedules.NotWebSchedulesAPI.models.staff.Role;
import com.notwebschedules.NotWebSchedulesAPI.models.staff.Staff;

public interface StaffRepository extends MongoRepository<Staff, String> {
	
	List<Staff> findAllByRole(Role role);
	Staff findByEmployeeId(String employeeId);
	List<Staff>findByFirstName(String firstName);
	List<Staff> findByLastName(String lastName);

}
