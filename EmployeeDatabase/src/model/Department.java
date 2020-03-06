package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="deportment")
public class Department {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="DEPORTMENT_ID")
	private int id;
	@Column(name="DEPORTMENT_NAME")
	private String deportmentName;
	
	public Department() {
	
		super();
	}
		// TODO Auto-generated constructor stub

		public Department(String deportmentName) {
			super();
			this.deportmentName = deportmentName;
		}

		public Department(int id, String deportmentName) {
			super();
			this.id = id;
			this.deportmentName = deportmentName;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getDeportmentName() {
			return deportmentName;
		}

		public void setDeportmentName(String deportmentName) {
			this.deportmentName = deportmentName;
		}

		@Override
		public String toString() {
			return "Department [id=" + id + ", deportmentName=" + deportmentName + "]";
		}
}