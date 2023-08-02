package com.actitime.testscript;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Listeners;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class ProjectModule extends BaseClass{

	public void textProjectModule() throws IOException, InterruptedException {
	FileLib f=new FileLib();
	String Projectname = f.getExcelFile("CreateProject", 1, 3);
	String ProjectDescription=f.getExcelFile("CreateProject", 1, 4);
	Reporter.log("createproject",true);
	HomePage h=new HomePage(driver);
	h.setTaskTab();
	TaskListPage t=new TaskListPage(driver);
	t.getAddnew().click();
	t.getNewProjectBtn().click();
	t.getProjectNameTbx().sendKeys(Projectname);
	t.getSelectProjectDD().click();
	t.getHdfcBtn().click();
	t.getProjectDescriptionTbx().sendKeys(ProjectDescription);
	Thread.sleep(4000);
	t.getCreateProjectbtn().click();

	}
}
