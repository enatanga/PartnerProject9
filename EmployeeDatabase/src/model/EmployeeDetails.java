package model;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employee_details")

public class EmployeeDetails {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "LIST_ID")
		private int id;
		@Column(name = "LIST_NAME")
		private String listName;
		@Column(name = "HIRED_DATE")
		private LocalDate hiredDate;
		@OneToOne(cascade=CascadeType.PERSIST)
		@JoinColumn(name="DEPORTMENT_ID")
		private Department deportment;
		@OneToMany(cascade=CascadeType.MERGE, fetch=FetchType.EAGER)
		@JoinTable
		  (
		      name="employee_details",
		      joinColumns={ @JoinColumn(name="LIST_ID", referencedColumnName="LIST_ID") },
		      inverseJoinColumns={ @JoinColumn(name="LIST_NAME", referencedColumnName="ID", unique=true) }
		  )

		private List<EmployeeList> listOfEmployee;

		public EmployeeDetails() {
			super();
			// TODO Auto-generated constructor stub
		}

		public EmployeeDetails( String listName,LocalDate hiredDate , Department deportment) {
			super();
			this.listName = listName;
			this.hiredDate = hiredDate;
			this.deportment = deportment;
		}

		public EmployeeDetails( String listName, LocalDate hiredDate , Department deportment, List<EmployeeList> listOfEmployee) {
			super();
			this.listName = listName;
			this.hiredDate = hiredDate;
			this.deportment = deportment;
			this.listOfEmployee= listOfEmployee;
		}

		public EmployeeDetails(int id, String listName, LocalDate hiredDate, Department deportment, List<EmployeeList> listOfEmployee) {
			super();
			this.id = id;
			this.listName = listName;
			this.hiredDate = hiredDate;
			this.deportment = deportment;
			this.listOfEmployee = listOfEmployee;
		}

			// TODO Auto-generated constructor stub		

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getListName() {
			return listName;
		}

		public void setListName(String listName) {
			this.listName = listName;
		}

		public LocalDate getHiredDate() {
			return hiredDate;
		}

		public void setHiredDate(LocalDate hiredDate) {
			this.hiredDate = hiredDate;
		}

		public Department getDeportment() {
			return deportment;
		}

		public void setDeportment(Department deportment) {
			this.deportment = deportment;
		}

		public List<EmployeeList> getListOfEmployee() {
			return listOfEmployee;
		}

		public void setListOfEmployee(List<EmployeeList> listOfEmployee) {
			this.listOfEmployee = listOfEmployee;
		}

		@Override
		public String toString() {
			return "EmployeeDetails [id=" + id + ", listName=" + listName + ", hiredDate=" + hiredDate + ", deportment="
					+ deportment + ", listOfEmployee=" + listOfEmployee + "]";
		}
}











