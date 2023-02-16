package org.tnsif.tableperclass;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TablePerClassInheritanceDemo {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		//create one emp1
		Employee e=new Employee();
		e.setId(1);
		e.setName("Aakansha");
		e.setSalary(30000.78);
		em.persist(e);
		
		//create second emp2
		Employee e1=new Employee();
		e1.setId(2);
		e1.setName("Anusha S");
		e1.setSalary(50000.78);
		em.persist(e1);
		
		//create one manager
		Manager m=new Manager();
		m.setId(3);
		m.setDeptname("IT");
		m.setName("Yogesh");
		m.setSalary(75000.89);
		em.persist(m);
		em.getTransaction().commit();
		System.out.println("Data is added in the database");
		em.close();
		factory.close();

		
	}

}