package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employees")

public class EmployeeList {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
 private int id;
	@Column(name ="DEPORTMENT")
 private String deportment;
	@Column(name ="EMPLOYEE")
 private String employee;
 
public EmployeeList() {
      super();
}
public EmployeeList(String deportment, String employee) {
	super();
	this.deportment= deportment;
	this.employee= employee;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getEmployee() {
	return employee;
}
public void setEmployee(String employee) {
	this.employee = employee;
}
public String getDeportment() {
	return deportment;
}
public void setDeportment(String deportment) {
	this.deportment = deportment;
}

public String EmployeeDetails( ) {
	return deportment + ": " + employee;
}

}
