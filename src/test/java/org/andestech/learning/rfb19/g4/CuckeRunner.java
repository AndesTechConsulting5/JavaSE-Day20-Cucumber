package org.andestech.learning.rfb19.g4;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/html-cucumber-report",
        "json:target/cucumber-report.json"},
        features = {"src/test/resources/features/"},
        glue = {"org.andestech.learning.rfb19.g4.glue"},
        tags = {"@math", "~@a2"}
)
public class CuckeRunner extends AbstractTestNGCucumberTests {


}
