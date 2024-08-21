package com.CoverFox.testCase;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.coverfox.PageObject.landingPage;
import com.coverfox.base.base;

@Listeners(Utilities.Listeners.class)
public class insuranceSelect extends base {
	WebDriver driver;
	base bs = new base();

	@BeforeMethod
	public void launchBrowser() {

		driver = bs.configInit();
	}

	@Test
	public void insuranceTest() {
		landingPage lp = new landingPage(driver);

		lp.yourGender();
//		lp.forYou();
		lp.clkNext();
		lp.enterAge();
		lp.ageEnter();
		lp.enterPincode();
		lp.enterMobNum();
		lp.clkContinue();
		String actualResult = lp.pageConfirmation().getText();
		String expectedResult = "50 matching Health Insurance Plans";
		Assert.assertEquals(actualResult, expectedResult, "Result is not matching. TC failed");

	}

	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		bs.tearDown();
	}
}