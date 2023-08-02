package com.actitime.generic;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v112.browser.Browser;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;

public class BaseClass {
		public WebDriver driver;
		@Parameters("browser")
		@BeforeClass
		public void OpenBrowser(String browser) {
			Reporter.log("OpenBrowser",true);
			if(browser.equals("chrome")) {
				driver=new ChromeDriver();
			}else if(browser.equals("edge"))
			{
				driver=new EdgeDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		@AfterClass
		public void CloseBrowser() {
			Reporter.log("CloseBrowser",true);
			driver.quit();
		}
		@BeforeMethod
		public void LogIn() throws IOException {
			Reporter.log("login",true);
			driver.get("https://demo.actitime.com/");
			FileLib f=new FileLib();
			String url = f.getPropertyFile("url");
			String un = f.getPropertyFile("username");
			String pwd = f.getPropertyFile("password");
			driver.get(url);
		LoginPage l=new LoginPage(driver);
		l.setLogin(un, pwd);
			
		}
		@AfterMethod
		public void LogOut() {
			Reporter.log("logout",true);
			HomePage h=new HomePage(driver);
			h.setLogoutBtn();	
		}
	}
