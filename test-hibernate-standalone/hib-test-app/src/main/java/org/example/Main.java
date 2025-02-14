package org.example;


import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.Version;

public class Main {
	private EntityManagerFactory entityManagerFactory;

	public static void main(String[] args) throws InterruptedException {
		Main main = new Main();

		System.out.println( Version.getVersionString() );

//		adding a data
		main.addData();
//		Thread.sleep( 1000 );

//		main.test2LC();
//		main.testQueryCache();

	}

	public void test2LC() {
		entityManagerFactory = Persistence.createEntityManagerFactory( "testPU" );


		// em1 session
		EntityManager entityManager1 = entityManagerFactory.createEntityManager();
		entityManager1.getTransaction().begin();
		Student student1 = entityManager1.find( Student.class, 1 );
		entityManager1.getTransaction().commit();
		entityManager1.close();


		// em2 session
		EntityManager entityManager2 = entityManagerFactory.createEntityManager();
		entityManager2.getTransaction().begin();
		Student student2 = entityManager2.find( Student.class, 1 );
		entityManager2.getTransaction().commit();
		entityManager2.close();


		entityManagerFactory.close();

	}

	public void testQueryCache() {
		entityManagerFactory = Persistence.createEntityManagerFactory( "testPU" );


		// em1 session
		EntityManager entityManager1 = entityManagerFactory.createEntityManager();
		entityManager1.getTransaction().begin();
		Query query1 = entityManager1.createQuery( "from Student where id = 1" );
		query1.setHint( "org.hibernate.cacheable", true );
		ArrayList<Student> student1 = (ArrayList<Student>) query1.getResultList();
		entityManager1.getTransaction().commit();
		entityManager1.close();


		// em2 session
		EntityManager entityManager2 = entityManagerFactory.createEntityManager();
		entityManager2.getTransaction().begin();
		Query query2 = entityManager2.createQuery( "from Student where id = 1" );
		query2.setHint( "org.hibernate.cacheable", true );
		ArrayList<Student> student2 = (ArrayList<Student>) query2.getResultList();
		entityManager2.getTransaction().commit();
		entityManager2.close();


		entityManagerFactory.close();
	}

	public void addData()
	{
		entityManagerFactory=Persistence.createEntityManagerFactory( "testPU" );
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		Student student=new Student();
		student.setName( "Anilabha" );
		entityManager.persist( student );
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
	}

}
