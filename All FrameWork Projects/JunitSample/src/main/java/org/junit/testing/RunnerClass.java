package org.junit.testing;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.sample.Sample;

//Way 1
//@RunWith(Suite.class)	
//@SuiteClasses({B.class,A.class,SampleProject.class})



public class RunnerClass {
  // way 2
	@Test
	public void tc1() {
		Result runClasses = JUnitCore.runClasses(B.class,A.class,Sample.class);
		System.out.println("RunTime="+runClasses.getRunTime());
		System.out.println("RunCount="+runClasses.getRunCount());
		System.out.println("FailTestCases="+runClasses.getFailureCount());
		System.out.println("Ignore Testcase Count="+runClasses.getIgnoreCount());

		List<Failure> failures = runClasses.getFailures();
        
		for (Failure fails : failures) {
			System.out.println(fails);
			
		}
	}
	
}
