package org.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources" ,
glue = "org.stepdefinition",
monochrome = true,  // for understanding 
dryRun = false , // for create snippets
snippets = SnippetType.CAMELCASE , // for create snippets with camelcase
tags = {"@Feature2"},// for head
plugin = {"html:Report", "junit:Report\\junitreport.xml", "json:Report\\jsonreport.json"})

public class TestRunnerClass {
	
}
