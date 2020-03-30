package automation.testcases;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features")
//format= {"pretty","html:target/cucumber-htmlreport","json-pretty:target/cucumber-report.json"})

public class TestRunner {
}
 
   
    