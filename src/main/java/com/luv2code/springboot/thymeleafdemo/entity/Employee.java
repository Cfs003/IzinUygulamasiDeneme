package com.luv2code.springboot.thymeleafdemo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {

	// define fields
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="email")
	private String email;

	@Column(name="leave_period")
	private int leavePeriod;
	
		
	// define constructors
	
	public Employee() {
		
	}
	
	public Employee(int id, String firstName, String lastName, String email,int leavePeriod) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.leavePeriod = leavePeriod;
	}


	public Employee(String firstName, String lastName, String email, int leavePeriod) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.leavePeriod = leavePeriod;
	}

	// define getter/setter
	
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getLeavePeriod() {
		return leavePeriod;
	}

	public void setLeavePeriod(int leavePeriod) {
		this.leavePeriod = leavePeriod;
	}

	// define tostring

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", leavePeriod=" +leavePeriod +"]";
	}
		
}











