package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Department;

public class EmployeeHelper {

	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("EmployeeDatabase");

	public void insertEmployee(Department s) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(s);
		em.getTransaction().commit();
		em.close();
	}
	public List<Department> showAllEmployee() {
		EntityManager em = emfactory.createEntityManager();
		List<Department> allEmployee = em.createQuery("SELECT s FROM Department s").getResultList();
		return allEmployee;
	}
	public Department searchForEmployeeByName(String deportmentName) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Department> typedQuery = em.createQuery("select s from Department s where s.deportmentName = :selectedName", Department.class);
		typedQuery.setParameter("selectedName", deportmentName);
		typedQuery.setMaxResults(1);

		Department found = typedQuery.getSingleResult();
		em.close();
		return found;
	}
}


