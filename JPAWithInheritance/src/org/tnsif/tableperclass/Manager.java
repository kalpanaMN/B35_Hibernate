package org.tnsif.tableperclass;

import javax.persistence.Entity;
import javax.persistence.Table;

//child class
//to demonstrate the example on class per table inheritance
@Entity
@Table(name="Manager")
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

