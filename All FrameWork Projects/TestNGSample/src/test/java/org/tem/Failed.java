package org.tem;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Failed implements IRetryAnalyzer {

	public boolean retry(ITestResult arg0) {
		
	int min=0,max=3;
	if(min<max) {
		min++;
		return  true;
	}
	
	return false;
	}
	

}
