package com.EmployeeStoredProceduceProject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.StoredProcedureQuery;

@Repository
public class EmpoyeeDao {
	@Autowired
	EntityManager entityManager;

	public String insertData(EmployeeEntity data) {
		// TODO Auto-generated method stub
		StoredProcedureQuery storedProcedure = entityManager.createNamedStoredProcedureQuery("firstStoredProcedure");
		storedProcedure.setParameter("firstName", data.getFirstName())
		.setParameter("lastName", data.getLastName())
		.setParameter("emailID", data.getEmailId())
		.setParameter("primaryContact", data.getPrimaryContact())
		.setParameter("alternativeContact", data.getAlternativeContact())
		.setParameter("address", data.getAddress())
		.setParameter("salary", data.getSalary())
		.setParameter("flag", data.isFlag());
         
         storedProcedure.execute();

		return "Data Inserted";
	}

	public String updateData(EmployeeEntity data, int id) {
		// TODO Auto-generated method stub
		List<EmployeeEntity> updateEmployeeDetails=entityManager.createNamedStoredProcedureQuery("secondStoredProcedure").setParameter(id, data).getResultList();
		return "Data Updated";
	}

	public List<EmployeeEntity> getAllObj() {
		// TODO Auto-generated method stub
		List<EmployeeEntity> employees=entityManager.createNamedStoredProcedureQuery("thirdStoredProcedure").getResultList();
		return employees;
	}

	public EmployeeEntity getObjById(int ids) {
		// TODO Auto-generated method stub
		EmployeeEntity getEmployeeById = (EmployeeEntity) entityManager.createNamedStoredProcedureQuery("fourthStoredProcedure").setParameter("employeeId", ids).getResultList();
		return getEmployeeById;
	}

	public String removeData(int ids) {
		// TODO Auto-generated method stub
		EmployeeEntity deleteEmployeeById = (EmployeeEntity) entityManager.createQuery("fifthStoredProcedure").setParameter("empoyeeId", ids).getResultList();
		return "Data Deleted";
	}

}
