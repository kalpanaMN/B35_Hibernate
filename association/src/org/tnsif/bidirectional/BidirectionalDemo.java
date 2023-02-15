package org.tnsif.bidirectional;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

//driver program
public class BidirectionalDemo {
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		Department d=new Department();
		d.setDeptid(12121);
		d.setDeptname("HR");
		
		Department d1=new Department();
		d1.setDeptid(12123);
		d1.setDeptname("Finance");
		
		Employee5 e=new Employee5();
		e.setId(11);
		e.setName("Megha");
		e.setSalary(35000.7f);
		
		e.setDept(d);
	
		
		Employee5 e1=new Employee5();
		e1.setId(12);
		e1.setName("Tanuja");
		e1.setSalary(25000.7f);
		e1.setDept(d1);
		
		em.persist(e);
		em.persist(e1);

		System.out.println("The data is added");
		
		em.getTransaction().commit();
		em.close();
		factory.close();
		
	}

}


