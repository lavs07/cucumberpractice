package com.ajioexecution;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\ELCOT\\eclipse-workspace\\cucumberPractice\\src\\test\\java\\com\\ajiofeature\\Ajio.feature",
                glue="com.ajiostepdefinition")
public class RunnerForAjio {

}
