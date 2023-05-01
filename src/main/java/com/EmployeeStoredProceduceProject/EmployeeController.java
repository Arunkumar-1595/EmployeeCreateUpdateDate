package com.EmployeeStoredProceduceProject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping(value = "insertData")
	public String insertData(@RequestBody EmployeeEntity data) {
		return employeeService.insertData(data);
	}
	
	@PutMapping(value = "updateData/{id}")
	public String updateData(@RequestBody EmployeeEntity data, @PathVariable int id) {
		return employeeService.updateData(data, id);
	}
	
	@GetMapping(value = "getAllObj")
	public List<EmployeeEntity> getAllObj() {
		return employeeService.getAllObj();
	}
	
	@GetMapping(value = "getObjByid/{ids}")
	public EmployeeEntity getObjById(@PathVariable int ids) {
		return employeeService.getObjById(ids);
	}
	
	@DeleteMapping(value = "removeData/{ids}")
	public String removeData(@PathVariable int ids) {
		return employeeService.removeData(ids);
	}

}
