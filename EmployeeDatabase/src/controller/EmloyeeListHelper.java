package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.EmployeeList;

public class EmloyeeListHelper {
	
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("EmployeeDatabase");

	public void insertEmployee(EmployeeList li) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(li);
		em.getTransaction().commit();
		em.close();
	}

	public List<EmployeeList> showAllEmp() {
		EntityManager em = emfactory.createEntityManager();
		List<EmployeeList> allEmps = em.createQuery("SELECT i FROM EmployeeList i").getResultList();
		return allEmps;
	}

	public void deleteEmp(EmployeeList toDelete) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<EmployeeList> typedQuery = em.createQuery(
				"select li from EmployeeList li where li.deportment = :selectedDeportpment and li.employee = :selectedemployee",
				EmployeeList.class);
		typedQuery.setParameter("selectedDeportpment", toDelete.getDeportment());
		typedQuery.setParameter("selectedemployee", toDelete.getEmployee());

		// we only want one result
		typedQuery.setMaxResults(1);

		// get the result and save it into a new list item
		EmployeeList result = typedQuery.getSingleResult();

		// remove it
		em.remove(result);
		em.getTransaction().commit();
		em.close();

	}
	public EmployeeList searchForEmpById(int idToEdit) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		EmployeeList found = em.find(EmployeeList.class, idToEdit);
		em.close();
		return found;
	}
	public void update(EmployeeList toEdit) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		
		em.merge(toEdit);
		em.getTransaction().commit();
		em.close();
	}
	public List<EmployeeList> searchForEmpByDep(String depName) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<EmployeeList> typedQuery = em.createQuery("select li from EmployeeList li where li.deportment = :selectedDeportmen", EmployeeList.class);
		typedQuery.setParameter("selectedDeportment", depName);

		List<EmployeeList> foundEmps = typedQuery.getResultList();
		em.close();
		return foundEmps;
	}

	public List<EmployeeList> searchForEmpByEmp(String empName) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<EmployeeList> typedQuery = em.createQuery("select li from EmployeeList li where li.employee = :selectedemployee", EmployeeList.class);
		typedQuery.setParameter("selectedemployee", empName);

		List<EmployeeList> foundEmps = typedQuery.getResultList();
		em.close();
		return foundEmps;
	}	
	public void cleanUp(){
		emfactory.close();
	}

}


