package org.test.org.test;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;


public class App {
	private EntityManagerFactory emf;

	public void test() throws Exception{

		boolean res=false;
		emf = Persistence.createEntityManagerFactory("testPU");

		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
// .. Write the business logic

//		Entityname en =new Entityname();
//		en.setId( 1 );
//		en.setName( "Anilabha" );
//		em.persist( en );


		tx.commit();
		em.close();
	}

}
