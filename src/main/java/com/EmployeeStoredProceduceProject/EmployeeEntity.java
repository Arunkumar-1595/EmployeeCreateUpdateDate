package com.EmployeeStoredProceduceProject;

import java.math.BigDecimal;
import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedStoredProcedureQueries;
import jakarta.persistence.NamedStoredProcedureQuery;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureParameter;
import jakarta.persistence.Table;

@Entity
@Table
@NamedStoredProcedureQueries({@NamedStoredProcedureQuery(name = "firstStoredProcedure", procedureName = "insertEmployeeDetails", parameters = {@StoredProcedureParameter(name="firstName", type=String.class, mode=ParameterMode.IN),
        @StoredProcedureParameter(name="lastName", type=String.class, mode=ParameterMode.IN),
        @StoredProcedureParameter(name="emailId", type=String.class, mode=ParameterMode.IN),
        @StoredProcedureParameter(name="primaryContact", type=String.class, mode=ParameterMode.IN),
        @StoredProcedureParameter(name="alternativeContact", type=String.class, mode=ParameterMode.IN),
        @StoredProcedureParameter(name="address", type=String.class, mode=ParameterMode.IN),
        @StoredProcedureParameter(name="salary", type=Integer.class, mode=ParameterMode.IN),
        @StoredProcedureParameter(name="flag", type=boolean.class, mode=ParameterMode.IN)}),
	@NamedStoredProcedureQuery(name = "secondStoredProcedure", procedureName = "updateEmployeeDetails", parameters = {@StoredProcedureParameter(mode = ParameterMode.IN,name = "employeeId",type = Integer.class)}),
	@NamedStoredProcedureQuery(name = "thirdStoredProcedure",procedureName = "getEmployeeDetails"),
    @NamedStoredProcedureQuery(name = "fourthStoredProcedure",procedureName = "getEmployeeDetailsById",parameters = {@StoredProcedureParameter(mode = ParameterMode.IN,name = "employeeId",type = Integer.class)}),
    @NamedStoredProcedureQuery(name = "fifthStoredProcedure", procedureName = "deleteEmployeeById",parameters = {@StoredProcedureParameter(mode = ParameterMode.IN,name = "employeeId",type = Integer.class)})})
public class EmployeeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String firstName;
	private String lastName;
	private String emailId;
	private String primaryContact;
	private String alternativeContact;
	private String address;
	private int salary;
	@Column(name = "createdDate", nullable = false, updatable = false)
	@CreationTimestamp
	private Date createdDate;
	@Column(name = "updatedDate", nullable = false, updatable = false)
	@CreationTimestamp
	private Date updatedDate;
	private boolean flag;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPrimaryContact() {
		return primaryContact;
	}
	public void setPrimaryContact(String primaryContact) {
		this.primaryContact = primaryContact;
	}
	public String getAlternativeContact() {
		return alternativeContact;
	}
	public void setAlternativeContact(String alternativeContact) {
		this.alternativeContact = alternativeContact;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
