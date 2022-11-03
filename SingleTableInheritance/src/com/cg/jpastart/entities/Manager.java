package com.cg.jpastart.entities;

import javax.persistence.*;
import javax.persistence.Table;

@Entity

@DiscriminatorValue(value="MGR")  
public class Manager extends Employee {

	private static final long serialVersionUID = 1L;
	
	private String departmentName;

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	

}