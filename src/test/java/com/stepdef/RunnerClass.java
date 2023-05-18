package com.stepdef;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features", glue = "com.stepdef", dryRun = !true, monochrome = true, snippets = SnippetType.CAMELCASE)
public class RunnerClass {
	
	
	
}
