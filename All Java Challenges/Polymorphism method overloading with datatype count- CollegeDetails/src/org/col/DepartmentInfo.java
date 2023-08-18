package org.col;
// Polymorphism method overloading with datatype count
public class DepartmentInfo {
	private void ug(String name , String course) {
		// TODO Auto-generated method stub
     System.out.println("Name :  "+ name);
     System.out.println("Course name: "+ course);
	}
	public static void main(String[] args) {
		
	
	DepartmentInfo a = new DepartmentInfo();
	a.ug("Poorni", "BE");
	}
}
