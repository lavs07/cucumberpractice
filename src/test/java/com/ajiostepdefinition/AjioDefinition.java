package com.ajiostepdefinition;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;

import com.baseclass.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AjioDefinition extends AjioLocators {
	String product1;
	String product2;
	
	@Given("Open the Brower")
	public void open_the_brower() {
		BaseClass.webdriverManager();
	    
	}

	@Given("launch the Url")
	public void launch_the_url() {
		getUrl("https://www.ajio.com/");
	    
	}

	@When("mousehover to Home&kitchen")
	public void mousehover_to_home_kitchen() throws InterruptedException {
	    sleep(3000);
		BaseClass.mouseHover(new AjioLocators().getHomeKitchen());
	    
	}

	@When("click on the Serveware&Drinkware")
	public void click_on_the_serveware_drinkware() {
		BaseClass.click(new AjioLocators().getClick());
	    
	}

	@When("Click on the sixth product")
	public void click_on_the_sixth_product() throws InterruptedException {
		sleep(7000);
		BaseClass.click(new AjioLocators().getClickproduct());
	    
	}

	@When("get the product name")
	public void get_the_product_name() throws InterruptedException {
		sleep(5000);
		BaseClass.getWindowHandles();
		String text1=BaseClass.getText(new AjioLocators().getProductname1());
		String text2=BaseClass.getText(new AjioLocators().getProductname2());
	    product1=(text1+" "+text2);
		System.out.println(product1);
	   
	}

	@When("click on add to bag")
	public void click_on_add_to_bag() {
		BaseClass.click(new AjioLocators().getClickAddToCart());
	    
	}

	@When("clic on Bag")
	public void clic_on_bag() throws InterruptedException {
		sleep(5000);
		BaseClass.click(new AjioLocators().getClickMiniBag());
	    
	}
	@When("get the final product name")
	public void get_the_final_product_name() {
	   product2= BaseClass.getText(new AjioLocators().getProductname3());
	   System.out.println(product2);
	}

	@Then("Validate the product name")
	public void validate_the_product_name() {
          boolean contains = product2.contains(product1);
		  System.out.println(contains);
		
	  	}


}

