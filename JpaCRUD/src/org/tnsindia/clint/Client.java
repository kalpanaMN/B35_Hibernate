package org.tnsindia.clint;

import org.tnsindia.entities.Student;
import org.tnsindia.service.StudentService;
import org.tnsindia.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           StudentService service=new StudentServiceImpl();
		
		   Student student=new Student();
		
		//creation
		/*
		student.setRollNo(1214);
		student.setName("Rajesh Jadhav");
		service.create(student);
		
		System.out.println("The data is inserted");
		*/
		
		
		//Retrieve
		/*student=service.retrieve(1213);
		System.out.println("ROLL NO: "+student.getRollNo()+" "+"Name: "+
		student.getName());
		*/
		
		//update
		/*student=service.retrieve(1213);
		student.setName("Anusha Siddaraju");
		service.update(student);
		System.out.println("The data is updated");*/
		
		//delete
		student=service.retrieve(1214);
		service.delete(student);
		System.out.println("The data is deleted");



		

	}

}	