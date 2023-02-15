package org.tnsindia.service;
import org.tnsindia.dao.StudentDAO;
import org.tnsindia.dao.StudentDAOImpl;
import org.tnsindia.entities.Student;

public class StudentServiceImpl implements StudentService{

	//to call the methods of StudentDao interface
	private StudentDAO dao;
	
	
	public StudentServiceImpl() {
		super();
		dao=new StudentDAOImpl();
	}

	@Override
	public void create(Student student) {
		dao.beginTransaction();
		dao.addStudent(student);
		dao.commitTransaction();
		
	}

	@Override
	public void update(Student student) {
		dao.beginTransaction();
		dao.updateStudent(student);
		dao.commitTransaction();
	}

	@Override
	public void delete(Student student) {
		dao.beginTransaction();
		dao.deleteStudent(student);
		dao.commitTransaction();
		
	}

	@Override
	public Student retrieve(int RollNo) {
		Student student=dao.getStudentByID(RollNo);
		return student;
	}

}
