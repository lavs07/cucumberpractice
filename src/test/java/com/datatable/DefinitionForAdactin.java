package com.datatable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.baseclass.BaseClass;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class DefinitionForAdactin extends BaseClass {
	@Given("open the chrome browser")
	public void open_the_chrome_browser() {
	 browserLaunch();
	}

	@Given("launch the Specified Url")
	public void launch_the_specified_url() {
		getUrl("https://adactinhotelapp.com/");
	   }
	@When("enter the username asMap")
	public void enter_the_username_as_map(DataTable datatable) {
		String username = datatable.asMaps().get(0).get("username");
		String password = datatable.asMaps().get(1).get("password");
		
		BaseClass.findElementId("username").sendKeys(username);
		BaseClass.findElementId("password").sendKeys();
		
	    
	}



		@When("click on the login button")
	public void click_on_the_login_button() {
		BaseClass.findElementBy(By.xpath("//*[@id='login']")).click();
		
		
	   
	}

	@Then("logged successfully")
	public void logged_successfully() {
		System.out.println("invalid credentials");
	   
	}


}