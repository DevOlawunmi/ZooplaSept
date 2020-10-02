package com.zoopla.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/com/zoopla/features"},
        plugin = {"pretty","json:target/report.json","de.monochromata.cucumber.report.PrettyReports:target/pretty-cucumber"},
        glue = {"com/zoopla/hook","com/zoopla/stepDefinitions"}
)


public class TestRunner {
}
