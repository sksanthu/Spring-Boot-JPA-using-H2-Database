package com.example.demo;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringH2UsingMultipleEntityApplication {
	//private static SpringH2UsingMultipleEntityApplication E;
	public static void main(String[] args) {
		SpringApplication.run(SpringH2UsingMultipleEntityApplication.class, args);
		//E.saveEmployee();
	}
		 @Autowired
		    private EmployeeRepo employeeRepo;
		    public void saveEmployee()
		    {
		        Employee employee = new Employee();
		        employee.setEmpName("Santhosh");
		        
		        Employee_Address employeeAddress1 = new Employee_Address();
		        employeeAddress1.setStreet("Street 1");
		        employeeAddress1.setCity("City 1");
		        employeeAddress1.setCountry("Country 1");
		        employeeAddress1.setState("State 1");
		        employeeAddress1.setEmployee(employee);
		        
		        
		        Set<Employee_Address> employeeAddress = new HashSet<Employee_Address>();
		        employeeAddress.add(employeeAddress1);
		        
		        employee.setEmployeeAddress(employeeAddress);
		        
		        employeeRepo.save(employee);
		        System.out.println("Employee and Employee Address saved successfully!!");
		    }
		}
