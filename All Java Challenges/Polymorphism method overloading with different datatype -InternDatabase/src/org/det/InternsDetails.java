package org.det;
//Polymorphism method overloading with different datatype 
public class InternsDetails {
	private void interndetails(String name) {
		// TODO Auto-generated method stub
		System.out.println("Intern Name:"+name);

	}
	private void interndetails(int age) {
		// TODO Auto-generated method stub
		System.out.println("Intern age:"+age);
	

	}
	private void interdetails(long phoneno) {
		// TODO Auto-generated method stub
		System.out.println("Intern Phoneno : "+phoneno);

	}
	
	public static void main(String[] args) {
		InternsDetails a = new InternsDetails();
		a.interndetails("Poornima");
		a.interndetails(21);
		a.interndetails(984338519);
		
		
	}

}
