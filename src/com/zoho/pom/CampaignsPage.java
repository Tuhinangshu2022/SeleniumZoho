package com.zoho.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignsPage {
	
	
	@FindBy(xpath = "//input[@value = \"New Campaign\"]")
	private WebElement newCampaignButton;
	
	@FindBy(xpath = "//td[@class='tableData']/../td[3]")
	private WebElement campaignNameInTheList;
	
	
	//=========================================================================================
	
	public CampaignsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}

	//=========================================================================================
	
	// Business Logic
	public WebElement getNewCampaignButton() {
		return newCampaignButton;
	}

	public WebElement getCampaignNameInTheList() {
		return campaignNameInTheList;
	}

}
