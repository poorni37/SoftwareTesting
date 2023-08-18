package org.emp;

public class Department extends Employee {

	@Override
	void employeeDesignation() {
		// TODO Auto-generated method stub
		System.out.println("Employee Designation : Intern");
		
	}
	private void departmentName() {
		// TODO Auto-generated method stub
     System.out.println("Department Name: Software Team");
	}
	public static void main(String[] args) {
		
		Department n =new Department();
		n.employeeName();
		n.employeeDesignation();
		n.departmentName();
	}

}
