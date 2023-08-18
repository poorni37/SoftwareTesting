package org.sof;

public class ApiTesting implements Automation {

	@Override
	public void framework() {
		// TODO Auto-generated method stub
		System.out.println("Framework: TestNG");
	}

	@Override
	public void TestCase() {
		// TODO Auto-generated method stub
		System.out.println("TestCases: FB");
	}
	
	private void RestAssured() {
		// TODO Auto-generated method stub
		

	}
	public static void main(String[] args) {
		ApiTesting n = new ApiTesting();
		n.framework();
		n.TestCase();
		n.RestAssured();
		
	}
   
}
