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
	@Column(name="dEPARMENT")
	private String department;
	@Column(name="eMPLOYEE")
	private String employee;
	@Column(name="hired_date")
	private LocalDate hireDate;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String department, String employee) {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String department, String employee, LocalDate hireDate) {
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getEmployee() {
		return employee;
	}

	public void setEmployee(String employee2) {
		this.employee = employee2;
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