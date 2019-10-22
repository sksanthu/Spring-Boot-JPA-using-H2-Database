package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
	public class Employee {
		@Id
		private int eid;
		private String Firstname;
		private String Lastname;
		private String designation;
		private String email;
		private String department;
		private int salary;
		private String country;
		
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public int getEid() {
			return eid;
		}
		public void setEid(int eid) {
			this.eid = eid;
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
		@Override
		public String toString() {
			return "Employee [eid=" + eid + ", Firstname=" + Firstname + ", Lastname=" + Lastname + ", country=" + country
					+ ", designation=" + designation + ", email=" + email + ", department=" + department + ", salary="
					+ salary + "]";
		}

		
	}



