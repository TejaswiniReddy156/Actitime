package com.actitime.testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass{
	@Test
	public void testCreateCustomer() throws InterruptedException, IOException {
		FileLib f=new FileLib();
		String customerName = f.getExcelFile("CreateCustomer", 1, 3);
		String customerDescription = f.getExcelFile("CreateCustomer", 1, 4);
		Reporter.log("createcustomer",true);
		HomePage h=new HomePage(driver);
		h.setTaskTab();
		TaskListPage t=new TaskListPage(driver);
		t.getAddnew().click();
		t.getNewCustomerBtn().click();
		t.getCustomerNametbx().sendKeys(customerName);;
		t.getCustomerDescriptoionTbx().sendKeys(customerDescription);
		t.getSelectCustomerDD().click();
		t.getBigBangComapnyTbx().click();
		t.getCreateCustomerBtn().click();
		Thread.sleep(4000);
		String actualname = t.getActualCustomerCreated().getText();
		Assert.assertEquals(actualname, customerName);
		
		
	}

}
