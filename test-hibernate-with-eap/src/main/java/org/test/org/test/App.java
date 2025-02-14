package org.test.org.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class App {
	private EntityManagerFactory emf;

	public void test() throws Exception{

		boolean res=false;
		emf = Persistence.createEntityManagerFactory("testPU");

		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
// .. Write the business logic
//		Text t1 = new Text("t1");
//		Text t2 = new Text("t2");
//		Document d = new Document();
//
//		d.getTexts().put(1, t1);
//		d.getTexts().put(2, t2);
//
//		List l = em.createQuery("SELECT d FROM Document d WHERE d.texts IS EMPTY").getResultList();
//
//		em.persist(d);
//
//		em.flush();
		tx.commit();
		em.close();
	}

}
