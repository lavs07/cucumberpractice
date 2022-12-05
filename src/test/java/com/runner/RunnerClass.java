package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\ELCOT\\eclipse-workspace\\cucumberPractice\\src\\test\\java\\cucumberPractice\\loginpage.feature",
glue= {"com.locators"})
public class RunnerClass {
	
	
			
}
