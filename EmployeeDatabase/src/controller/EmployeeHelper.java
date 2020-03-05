package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Employee;


public class EmployeeHelper {

	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("employeedata");

	public void insertItem(Employee empl) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(empl);
		em.getTransaction().commit();
		em.close();
	}

	public List<Employee> showAllEmployee() {
		EntityManager em = emfactory.createEntityManager();
		List<Employee> allEmployee = em.createQuery("SELECT i FROM Employee i").getResultList();
		return allEmployee;
	}

	public void deleteItem(Employee toDelete) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Employee> typedQuery = em.createQuery(
				"select empl from Employee empl where empl.department = :selectedDepartment and empl.employee = :selectedEmployee",
				Employee.class);
		// Substitute parameter with actual data from the toDelete item
		typedQuery.setParameter("selectedDepartment", toDelete.getDepartment());
		typedQuery.setParameter("selectedEmployee", toDelete.getEmployee());

		// we only want one result
		typedQuery.setMaxResults(1);

		// get the result and save it into a new list item
		Employee result = typedQuery.getSingleResult();

		// remove it
		em.remove(result);
		em.getTransaction().commit();
		em.close();

	}

	public Employee searchForEmployeeById(int idToEdit) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		Employee found = em.find(Employee.class, idToEdit);
		em.close();
		return found;
	}

	public void updateItem(Employee toEdit) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();

		em.merge(toEdit);
		em.getTransaction().commit();
		em.close();
	}

	public List<Employee> searchForEmployeeByStore(String departmentName) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Employee> typedQuery = em.createQuery("select empl from Employee empl where empl.department = :selectedDepartment",
				Employee.class);
		typedQuery.setParameter("selectedDepartment", departmentName);

		List<Employee> foundItems = typedQuery.getResultList();
		em.close();
		return foundItems;
	}

	public List<Employee> searchForEmployeeByItem(String employeeName) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Employee> typedQuery = em.createQuery("select empl from Employee empl where empl.employee = :selectedEmployee",
				Employee.class);
		typedQuery.setParameter("selectedEmployee", employeeName);

		List<Employee> foundEmployee = typedQuery.getResultList();
		em.close();
		return foundEmployee;
	}

	public void cleanUp() {
		emfactory.close();
	}

}
