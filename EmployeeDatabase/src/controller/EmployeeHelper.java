package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Employee;


public class EmployeeHelper {

	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("employeedata");

	public void insertEmployee(Employee li) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(li);
		em.getTransaction().commit();
		em.close();
	}

	public List<Employee> showAllEmployee() {
		EntityManager em = emfactory.createEntityManager();
		List<Employee> allItems = em.createQuery("SELECT i FROM Employee i").getResultList();
		return allItems;
	}

	public void deleteEmployee(Employee toDelete) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Employee> typedQuery = em.createQuery(
				"select li from Employee li where li.Department = :selectedDepartment and li.department = :selectedDepartment",
				Employee.class);
		// Substitute parameter with actual data from the toDelete item
		typedQuery.setParameter("selectedDepartment", toDelete.getDepartment());
		typedQuery.setParameter("selectedStore", toDelete.getEmployee());

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
}