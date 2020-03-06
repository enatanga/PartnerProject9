package model;

import java.time.LocalDate;

public class Employee {
	private int id;
	private int name;
	private int department;
	private LocalDate hireDate;
	
	//Default no arg constructor
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, int name, int department, LocalDate hireDate) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.hireDate = hireDate;
	}
	//Getters and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}
	public int getDepartment() {
		return department;
	}
	public void setDepartment(int department) {
		this.department = department;
	}
	public LocalDate getHireDate() {
		return hireDate;
	}
	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", hireDate=" + hireDate + "]";
	}
	
	
	
}
