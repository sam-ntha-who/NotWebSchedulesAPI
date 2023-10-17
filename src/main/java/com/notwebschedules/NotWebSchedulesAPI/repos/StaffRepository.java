package com.notwebschedules.NotWebSchedulesAPI.repos;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.notwebschedules.NotWebSchedulesAPI.models.staffInfo.Role;
import com.notwebschedules.NotWebSchedulesAPI.models.staffInfo.Staff;

public interface StaffRepository extends MongoRepository<Staff, String> {
	
	List<Staff> findAllByRole(Role role);
	Staff findByEmployeeId(String employeeId);
	List<Staff>findByFirstName(String firstName);
	List<Staff> findByLastName(String lastName);

}
