package com.spring.learning.Autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

//if we keep annotation on field then we dont need ctor or setter
//@Qualifier("deptObj") to differentiate if multiple beans are created
public class Company {
//	@Autowired
//	@Qualifier("deptObj")
//	HRDept dept;
	
//	@Autowired
//	@Qualifier("deptHR")
//	Department dept;
//
////	public void setDept(HRDept dept) {
////		this.dept = dept;
////	}
////
////	@Autowired
////	public Company(@Qualifier("deptObj") HRDept hrDept) {
////		this.dept = hrDept;
////	}
//
//	public void companyWork() {
//		if (dept == null) {
//			System.out.println("dept is null");
//		} else {
//			dept.work();
//		}
//	}
	
	
	public void companyWorking(@Autowired Department dept) {
		if (dept == null) {
			System.out.println("dept is null");
		} else {
			dept.work();
		}
	}
}
