package com.zoho.generic;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.zoho.pom.HomePage;
import com.zoho.pom.LoginPage;

public class BaseClass {
	
	//static {
	//	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	//}
	
	
	public static WebDriver driver;
	
	@BeforeTest
	public void openBrowser() {
		Reporter.log("Open Browser", true);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	
	
	@AfterTest
	public void closeBroser() {
		driver.close();
		Reporter.log("Close Browser", true);
	}
	
	
	@BeforeClass
	public void login() throws IOException {
		Reporter.log("Login", true);
		FileLib f = new FileLib();
		String url = f.getPropertyData("url");
		String un = f.getPropertyData("un");
		String pw = f.getPropertyData("pw");
		
		driver.get(url);
		LoginPage l = new LoginPage(driver);
		l.setLogin(un, pw);
		
	}
	
	
	@AfterClass
	public void logout() {
		Reporter.log("LogOut", true);
		HomePage h = new HomePage(driver);
		h.getLogoutLink().click();
		
	}
	 
}