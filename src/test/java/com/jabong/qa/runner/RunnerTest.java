package com.jabong.qa.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Feature",
				glue="com.jabong.qa.steps",
				plugin="de.monochromata.cucumber.report.PrettyReports:target/cucumberReports1")

public class RunnerTest {
	

}
