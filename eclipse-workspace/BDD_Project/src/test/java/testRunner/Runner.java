package testRunner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)				
@CucumberOptions(tags="@TC_04",features="features/NewDetails.feature",plugin={"html:target/cucumber-report/report.html"}, glue={"stepDefination"})
public class Runner {
	
}

