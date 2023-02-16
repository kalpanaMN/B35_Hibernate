package org.tnsindia.singletableinheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

//child class
//to demonstrate the example on single table inheritance
@Entity
@DiscriminatorValue("MNG")

public class Manager extends Employee{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String deptname;

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	
	

}