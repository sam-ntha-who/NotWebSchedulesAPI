package com.notwebschedules.NotWebSchedulesAPI.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.notwebschedules.NotWebSchedulesAPI.models.staff.Staff;
import com.notwebschedules.NotWebSchedulesAPI.repos.StaffRepository;

@RestController
public class StaffController {
	
	@Autowired
	private StaffRepository staffRepo;
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	// CRUD Functions
	
	// create staff member
	@PostMapping("/create-new-staff")
	@ResponseStatus(HttpStatus.CREATED)
	public Staff addStaff(@RequestBody Staff staff) {
		staffRepo.insert(staff);
		return staff;
	}

	// read staff members
	@GetMapping("/all-staff")
	public List<Staff> findAllStaff() {
		return staffRepo.findAll();
	}
	
	@GetMapping("/staff-profile/{employeeId}")
	public Staff findStaffById(@RequestParam String employeeId) {
		Staff staff = staffRepo.findByEmployeeId(employeeId);
		return staff;
	}
	
	// delete staff member
	@DeleteMapping("/remove-staff-member/{employeeId}")
	@ResponseStatus(HttpStatus.NO_CONTENT) 
	public void removeStaff(@PathVariable String employeeId) {
		// TODO: throw an exception for id not found
		Staff staffToRemove = staffRepo.findByEmployeeId(employeeId);
		staffRepo.delete(staffToRemove);
		
	}
	
}
