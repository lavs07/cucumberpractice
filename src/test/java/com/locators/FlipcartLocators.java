package com.locators;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class FlipcartLocators extends BaseClass{
	public FlipcartLocators(){
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath="//button[text()='✕']")
	private WebElement close;
	
	@FindBy(xpath="//input[@class='_3704LK']")
	private WebElement search;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submit;
	
	@FindBy(xpath="(//div[contains(text(),'OPPO K10')])[1]")
	private WebElement click;
	
	@FindBy(xpath="//*[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	private WebElement addtocart;
	
	@FindBy(xpath="//*[text()='14,990']")
	private WebElement price;
	
	@FindBy(xpath="//*[text()='Place Order']")
	private WebElement place;
	
	public WebElement getPlace() {
		return place;
	}

	public void setPlace(WebElement place) {
		this.place = place;
	}

	@FindBy(xpath="//span[text()='Payment Options']")
	private WebElement logged;

	public WebElement getClose() {
		return close;
	}

	public WebElement getSearch() {
		return search;
	}
	

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getClick() {
		return click;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

	public WebElement getPrice() {
		return price;
	}

	public WebElement getLogged() {
		return logged;
	}
	
	
	
	

}
