package com.EmployeeStoredProceduceProject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@ Service
public class EmployeeService {
	@Autowired
	EmpoyeeDao employeeDao;

	public String insertData(EmployeeEntity data) {
		// TODO Auto-generated method stub
		return employeeDao.insertData(data);
	}

	public String updateData(EmployeeEntity data, int id) {
		// TODO Auto-generated method stub
		return employeeDao.updateData(data, id);
	}

	public List<EmployeeEntity> getAllObj() {
		// TODO Auto-generated method stub
		return employeeDao.getAllObj();
	}

	public EmployeeEntity getObjById(int ids) {
		// TODO Auto-generated method stub
		return employeeDao.getObjById(ids);
	}

	public String removeData(int ids) {
		// TODO Auto-generated method stub
		return employeeDao.removeData(ids);
	}

}
