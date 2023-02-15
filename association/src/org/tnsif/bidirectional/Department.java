package org.tnsif.bidirectional;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="department")
public class Department {
	
	@Id
	//@Column(name="DeptId")
	private int deptid;
	private String deptname;
	
	/*@OneToMany(mappedBy="department")
	private Set<Employee>employee;*/
	
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	
	
	
	
	

}
public class Department {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
