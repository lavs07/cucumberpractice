package com.ajiostepdefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class AjioLocators extends BaseClass {
   public AjioLocators() {
	   PageFactory.initElements(driver, this);
   }
   @FindBy(xpath="//*[text()='HOME AND KITCHEN']")
   private WebElement HomeKitchen;
   
   @FindBy(xpath="(//*[contains(text(),'Serveware')])[1]")
   private WebElement click;
   
   @FindBy(xpath="//*[text()='1 PC Floral Printed Snacks Plate']")
   private WebElement clickproduct;
   
   @FindBy(xpath="//*[text()='CLAY CRAFT']")
   private WebElement productname1;
   
   @FindBy(xpath="(//*[text()='1 PC Floral Printed Snacks Plate'])[2]")
   private WebElement productname2;
   
   @FindBy(xpath="//*[contains(text(),'ADD')]")
   private WebElement clickAddToCart;
   
   @FindBy(xpath="//*[@class='ic-cart ']")
   private WebElement clickMiniBag;
   
   @FindBy(xpath="//*[text()='1 PC Floral Printed Snacks Plate']")
   private WebElement productname3;

public WebElement getHomeKitchen() {
	return HomeKitchen;
}

public WebElement getClick() {
	return click;
}

public WebElement getClickproduct() {
	return clickproduct;
}

public WebElement getProductname1() {
	return productname1;
}

public WebElement getProductname2() {
	return productname2;
}

public WebElement getClickAddToCart() {
	return clickAddToCart;
}

public WebElement getClickMiniBag() {
	return clickMiniBag;
}

public WebElement getProductname3() {
	return productname3;
}
   
   
   
   
   
	

}
