package com.coverfox.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import dev.failsafe.internal.util.Assert;

public class landingPage {
	WebDriver driver;

	public landingPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[contains(text(),'Male')]")
	WebElement yourGender;

//	@FindBy(xpath = "//div[contains(text(),'You')]")
//	WebElement forYou;

	@FindBy(xpath = "//div[contains(text(),'Next')]")
	WebElement clkNext;

	@FindBy(id = "Age-You")
	WebElement enterAge;

	@FindBy(xpath = "//div[contains(text(),'Next')]")
	WebElement ageEnter;

	@FindBy(xpath = "//input[@placeholder=\"6 Digit Pincode\"]")
	WebElement enterPincode;

	@FindBy(id="want-expert")
	WebElement enterMobNum;

	@FindBy(xpath = "//div[contains(text(),'Continue')]")
	WebElement clkContinue;

	@FindBy(xpath = "//div[contains(text(),'50 matching Health Insurance Plans')]")
	WebElement pageConfirmation;

	public WebElement yourGender() {

		yourGender.click();
		return yourGender;
	}

//	public WebElement forYou() {
//
//		forYou.click();
//		return forYou;
//	}

	public WebElement clkNext() {

		clkNext.click();
		return clkNext;
	}

	public WebElement enterAge() {
		
		Select select = new Select(enterAge);
		select.selectByValue("26y");
		return enterAge;
	}
	
	public WebElement ageEnter() {
		
		ageEnter.click();
		return ageEnter;
	}
	
	public WebElement enterPincode() {
		
		enterPincode.sendKeys("734008");
		return enterPincode;
	}
	
	public WebElement enterMobNum() {
		
		enterMobNum.sendKeys("9234567890");
		return enterMobNum;
	}
	
	public WebElement clkContinue() {
		
		clkContinue.click();
		return clkContinue;
	}
	
	public WebElement pageConfirmation() {
		 
		return pageConfirmation;
	}
}
