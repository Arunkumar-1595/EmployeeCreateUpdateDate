package com.EmployeeStoredProceduceProject;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer>{

	Object createNamedStoredProcedureQuery(String string);

}
