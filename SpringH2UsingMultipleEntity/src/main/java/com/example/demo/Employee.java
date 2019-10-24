package com.example.demo;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Employee 
{
	@Id
	 @GeneratedValue
	 @Column(name="EMP_ID")
	private int eid;
	private String empName;
	private String Firstname;
	private String Lastname;
	private String designation;
	private String email;
	private String department;
	private int salary;
	
	 @OneToMany(fetch = FetchType.EAGER,mappedBy="employee",cascade = CascadeType.ALL)
	    private Set<Employee_Address> employeeAddress;

	    public Employee()
	    {
	        super();
	    }

	    public Employee(int empId, String empName, Set<Employee_Address> employeeAddress)
	    {
	        super();
	        this.eid = empId;
	        this.empName = empName;
	        this.employeeAddress = employeeAddress;
	    }
	public int getEid() 
	{
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public Set<Employee_Address> getEmployeeAddress() {
		return employeeAddress;
	}


	public void setEmployeeAddress(Set<Employee_Address> employeeAddress) {
		this.employeeAddress = employeeAddress;
	}


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", Firstname=" + Firstname + ", Lastname=" + Lastname + ", designation="
				+ designation + ", email=" + email + ", department=" + department + ", salary=" + salary
				+ ", employeeAddress=" + employeeAddress + "]";
	}

	
}
