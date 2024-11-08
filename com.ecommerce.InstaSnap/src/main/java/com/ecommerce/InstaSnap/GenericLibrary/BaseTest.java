package com.ecommerce.InstaSnap.GenericLibrary;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
	@BeforeClass
	public void BrowserSetup() {
		Reporter.log("browser launched successfully",true);
		
	}
	@BeforeMethod
	public void login() {
		Reporter.log("login successfull",true);
		
	}
	@AfterMethod
	public void logout() {
		Reporter.log("logout successfull",true);
	}
	@AfterClass
	public void TerminateBrowser() {
		Reporter.log("Browser closed succesfully", true);
		
	}
	
	
	

}
