package org.tnsindia.service;

import org.tnsindia.entities.Student;

public interface StudentService {
	
	//abstract method for CRUD 
		void create(Student student);
		void update(Student student);
		void delete(Student student);
		Student retrieve(int RollNo);

		

}
