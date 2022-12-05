package com.locators;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import com.baseclass.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DefinitionClass extends FlipcartLocators {
	@Given("open the browser")
	public void open_the_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	    
	}

	@Given("launch the url")
	public void launch_the_url() {
		getUrl("https://www.flipkart.com/");
		BaseClass.click(new FlipcartLocators().getClose());
	   
	}

	@When("search the oppo moblie")
	public void search_the_oppo_moblie() {
		BaseClass.sendKeys(new FlipcartLocators().getSearch(), "oppo");
		BaseClass.click(new FlipcartLocators().getSubmit());
	   
	}

	@When("select the first mobile")
	public void select_the_first_mobile() throws InterruptedException {
		sleep(7000);
		BaseClass.click(new FlipcartLocators().getClick());
	    
	}

	@When("click on the go to cart")
	public void click_on_the_go_to_cart() throws InterruptedException {
		sleep(3000);
		BaseClass.getWindowHandles();
		sleep(3000);
		BaseClass.click(new FlipcartLocators().getAddtocart());
	
		
	}

	@When("get the product price")
	public void get_the_product_price() throws InterruptedException {
		sleep(5000);
	   BaseClass.getText(new FlipcartLocators().getPrice());
	   
	   
	}
	@When("click on the place order")
	public void click_on_the_place_order() throws InterruptedException {
		sleep(6000);
		BaseClass.click(new FlipcartLocators().getPlace());
	}
//	@When("click on the place order")
//	public void get_the_product_place() throws InterruptedException {
//		sleep(3000);
//	   BaseClass.click(new FlipcartLocators().getPlace());
//	}
	
	

	@Then("the item added successfully")
	public void the_item_added_successfully() {
		if(new FlipcartLocators().getLogged().isDisplayed()) {
			System.out.println("The item added in the cart");
		}
		else {
			System.out.println("not added");
		}
	    
	}

}
