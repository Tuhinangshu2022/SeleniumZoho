package com.zoho.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	//Elements IN Upper Menu BAR
	@FindBy(xpath = "//a[text() = 'Home']")
	private WebElement homeModule;
	
	@FindBy(xpath = "//a[text() = 'Leads']")
	private WebElement leadsModule;
	
	@FindBy(xpath = "//a[text() = 'Accounts']")
	private WebElement accountsModule;
	
	@FindBy(xpath = "//a[text() = 'Contacts']")
	private WebElement contactsModule;
	
	@FindBy(xpath = "//a[text() = 'Potentials']")
	private WebElement potentialsModule;
	
	@FindBy(xpath = "//a[text() = 'Campaigns']")
	private WebElement campaignsModule;
	
	@FindBy(xpath = "//a[text() = 'Reports']")
	private WebElement reportsModule;
	
	@FindBy(xpath = "//a[text() = 'Dashboards']")
	private WebElement dashboardsModule;
	
	@FindBy(xpath = "//a[text() = 'Forecasts']")
	private WebElement forecastsModule;
	
	@FindBy(xpath = "//a[text() = 'Products']")
	private WebElement productsModule;
	
	@FindBy(xpath = "//a[text() = 'Sales Order']")
	private WebElement salesOrderModule;
	
	@FindBy(xpath = "//a[text() = 'Purchase Order']")
	private WebElement purchaseOrderModule;
	
	@FindBy(xpath = "//a[contains(text(),'Logout')]")
	private WebElement logoutLink;
	
	@FindBy(xpath = "//td[@class='logoLayer topBorder']/img")
	private WebElement logo;
	
	@FindBy(id = "scrollright")
	private WebElement rightArrow;
	
	@FindBy(id = "scrollleft")
	private WebElement leftArrow;
	
	
	


//-----------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------
	
	// Initialization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
//-----------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------
	//Business Logic


	public WebElement getHomeModule() {
		return homeModule;
	}


	public WebElement getLeadsModule() {
		return leadsModule;
	}


	public WebElement getAccountsModule() {
		return accountsModule;
	}


	public WebElement getContactsModule() {
		return contactsModule;
	}


	public WebElement getPotentialsModule() {
		return potentialsModule;
	}


	public WebElement getCampaignsModule() {
		return campaignsModule;
	}


	public WebElement getReportsModule() {
		return reportsModule;
	}


	public WebElement getDashboardsModule() {
		return dashboardsModule;
	}


	public WebElement getForecastsModule() {
		return forecastsModule;
	}

	

	public WebElement getRightArrow() {
		return rightArrow;
	}


	public WebElement getLeftArrow() {
		return leftArrow;
	}


	public WebElement getProductsModule() {
		return productsModule;
	}


	public WebElement getSalesOrderModule() {
		return salesOrderModule;
	}


	public WebElement getPurchaseOrderModule() {
		return purchaseOrderModule;
	}


	public WebElement getLogoutLink() {
		return logoutLink;
	}


	public WebElement getLogo() {
		return logo;
	}
	
	
	

}
