package model;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employees")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	@Column(name="DEPARMENT")
	private int department;
	@Column(name="EMPLOYEE")
	private int employee;
	@Column(name="TRIP_DATE")
	private LocalDate hireDate;
	
	//Default no arg constructor
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, int department, int employee, LocalDate hireDate) {
		super();
		this.id = id;
		this.department = department;
		this.employee = employee;
		this.hireDate = hireDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDepartment() {
		return department;
	}

	public void setDepartment(int department) {
		this.department = department;
	}

	public int getEmployee() {
		return employee;
	}

	public void setEmployee(int employee) {
		this.employee = employee;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", department=" + department + ", employee=" + employee + ", hireDate=" + hireDate
				+ "]";
	}
	
}