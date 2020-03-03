package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class EmployeeDetailsHelper {

	public class EmployeeDetailsHelper {
		static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("EmployeeDatabase");

		public void insertNewListDetails(EmployeeDetails s) {
			EntityManager em = emfactory.createEntityManager();
			em.getTransaction().begin();
			em.persist(s);
			em.getTransaction().commit();
			em.close();
		}
		public List<EmployeeDetails> getLists() {
			EntityManager em = emfactory.createEntityManager();
			List<EmployeeDetails> allDetails = em.createQuery("SELECT d FROM EmployeeDetails d").getResultList();
			return allDetails;
		}
		public EmployeeDetails searchForListById(Integer tempId) {
			// TODO Auto-generated method stub
			EntityManager em = emfactory.createEntityManager();
			em.getTransaction().begin();
			EmployeeDetails found = em.find(EmployeeDetails.class, tempId);
			em.close();
			return found;
		}
		public void deleteEmployee(EmployeeDetails listToDelete) {
			// TODO Auto-generated method stub
			EntityManager em = emfactory.createEntityManager();
			em.getTransaction().begin();
			TypedQuery<EmployeeDetails> typedQuery = em.createQuery("select d from EmployeeDetails d where d.id = :selectedid",EmployeeDetails.class);
			
			typedQuery.setParameter("selectedid", listToDelete.getId());
			typedQuery.setMaxResults(1);

			// get the result and save it into a new list detail object
			EmployeeDetails result = typedQuery.getSingleResult();

			// remove it
			em.remove(result);
			em.getTransaction().commit();
			em.close();
		}
		public void updateList(EmployeeDetails toEdit) {
			// TODO Auto-generated method stub
			EntityManager em = emfactory.createEntityManager();
			em.getTransaction().begin();
			
			em.merge(toEdit);
			em.getTransaction().commit();
			em.close();
		}
	}
}
