package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addnew;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCustomerBtn;
	
	@FindBy(xpath="//input[@placeholder='Enter Customer Name' and@class]")
	private WebElement customerNametbx;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement customerDescriptoionTbx;
	
	@FindBy(xpath="//div[text()='- Select Customer -' and @class='emptySelection']")
	private WebElement selectCustomerDD;
	
	@FindBy(xpath="//div[text()='Big Bang Company' and @class='itemRow cpItemRow ']")
	private WebElement bigBangComapnyTbx;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createCustomerBtn;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']//div[@class='title']")
	private WebElement actualCustomerCreated;
	
	@FindBy(xpath="//div[@class='item createNewProject']")
	private WebElement newProjectBtn;
	
	@FindBy(xpath="//input[@placeholder='Enter Project Name' and @class]")
	private WebElement projectNameTbx;
	
	@FindBy(xpath="//div[@class='customerSelectorPlaceholder selectorWithPlaceholderContainer notSelected']//input[@type='text']")
	private WebElement selectProjectDD;
	
	public WebElement getNewProjectBtn() {
		return newProjectBtn;
	}

	public WebElement getProjectNameTbx() {
		return projectNameTbx;
	}

	public WebElement getSelectProjectDD() {
		return selectProjectDD;
	}

	public WebElement getHdfcBtn() {
		return hdfcBtn;
	}

	public WebElement getProjectDescriptionTbx() {
		return projectDescriptionTbx;
	}

	public WebElement getCreateProjectbtn() {
		return CreateProjectbtn;
	}

	@FindBy(xpath="//div[text()='HDFC_001']")
	private WebElement hdfcBtn;
	
	@FindBy(xpath="//div[@class='components_description']//textarea[@placeholder='Add Project Description']")
	private WebElement projectDescriptionTbx;
	
	@FindBy(xpath="//div[text()='Create Project']")
	private WebElement CreateProjectbtn;
	
	
	public WebElement getActualCustomerCreated() {
		return actualCustomerCreated;
	}

	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddnew() {
		return addnew;
	}

	public WebElement getNewCustomerBtn() {
		return newCustomerBtn;
	}

	public WebElement getCustomerNametbx() {
		return customerNametbx;
	}

	public WebElement getCustomerDescriptoionTbx() {
		return customerDescriptoionTbx;
	}

	public WebElement getSelectCustomerDD() {
		return selectCustomerDD;
	}

	public WebElement getBigBangComapnyTbx() {
		return bigBangComapnyTbx;
	}

	public WebElement getCreateCustomerBtn() {
		return createCustomerBtn;
	}
	

}
