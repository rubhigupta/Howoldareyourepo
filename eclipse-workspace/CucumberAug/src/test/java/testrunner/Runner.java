package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(format = {"pretty","html:D:\\Seedinfotech\\cucumber-htmlreport"}, features= "Feature/FeatureFile.feature", glue= {"stepdefinition"})
public class Runner {

}
