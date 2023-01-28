package com.example.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "", features = "src/test/resources/feature/LoginpageOrangeHRM.feature", 
glue = {"com.example.definition","hooks"},
                 plugin = {"pretty"},
dryRun=true,
publish=true)





public class CucumberRunnerHooksTest {
	
	
	

}
