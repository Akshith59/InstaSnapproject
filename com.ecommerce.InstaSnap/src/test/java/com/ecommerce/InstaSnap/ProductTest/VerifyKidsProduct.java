package com.ecommerce.InstaSnap.ProductTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.ecommerce.InstaSnap.GenericLibrary.BaseTest;

public class VerifyKidsProduct extends BaseTest {
	@Test (priority=1)
	public void createProduct() {
		Reporter.log("kids product created",true);
		
	}
	@Test(priority =2,invocationCount=2,dependsOnMethods="createProduct")
	public void updateProduct() {
	Reporter.log("product updated",true);
	}

}
