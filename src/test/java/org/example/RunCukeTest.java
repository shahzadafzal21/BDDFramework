package org.example;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)



@CucumberOptions(features = "C:\\Users\\shagu\\IdeaProjects\\BDDFramework\\BDDFramework\\src\\test\\Resourses\\Homepage.feature",tags={"@MultipleInput"},

        plugin = {"html:target/cucumber-html-report",
                 "json:target/cucumber-json-report.json",
                 "junit:target/cucumber-xml-report.xml",
                 "pretty:target/cucumber-pretty-report.txt"}
)


public class RunCukeTest {
}

// push code into own branch

// push code into own branch

// push into dev branch

// push into my own branch

// this is demo1

// this is the pull command demo


