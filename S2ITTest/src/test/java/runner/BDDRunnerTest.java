package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(  monochrome = true,
features = "src/test/features/",
  format = { "pretty","html: cucumber-html-reports",
             "json: cucumber-html-reports/cucumber.json" },
    glue = "bdd" )
public class BDDRunnerTest{}
