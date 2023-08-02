package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.BaseClass;

public class HomePage extends BaseClass{
	@FindBy(id="logoutLink")
	private WebElement logOut;
	
	
	@FindBy(xpath="//div[text()='Tasks']")
	private WebElement Tasktab;


	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setLogoutBtn() {
		logOut.click();
	}
		
		public void setTaskTab() {
		Tasktab.click();
	}
	
	
	

}
