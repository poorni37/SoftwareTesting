package org.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/reasources" ,glue = "org.stepdefinition", monochrome=true ,strict =true)
public class TestRunnerClass {

}
