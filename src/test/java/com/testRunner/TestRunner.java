package com.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions 
					(
							features = {".//Features/openapplication.feature"},
//							features = {".//Features/exampleFailedTestCase.feature"},
//							features = {".//Features/requestademo.feature"},
							glue = "com.stepDefinition",
							dryRun = false,
							monochrome = true,
			                plugin= {"pretty",
			                        "html:reports/myreport.html",
			                        "json:reports/myreport.json",
			                        "rerun:target/rerun.txt",   
			                }
					)

public class TestRunner {

}
