package com.zoho.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignsDetailsPage {
	//@FindBy()
	
	@FindBy(xpath = "//td[@id='Campaign Name']/../td[@id='mouseArea__Campaign Name']")
	private WebElement createdCampaignNameText;
	
	@FindBy(xpath = "(//input[@value='Edit'])[1]")
	private WebElement editButton1;
	
	@FindBy(xpath = "(//input[@value='Edit'])[2]")
	private WebElement editButton2;
	
	@FindBy(xpath = "(//input[@value='Delete'])[1]")
	private WebElement deleteButton1;
	
	@FindBy(xpath = "(//input[@value='Delete'])[1]")
	private WebElement deleteButton2;
	
	@FindBy(xpath = "(//input[@value='Clone'])[1]")
	private WebElement cloneButton1;
	
//==============================================================================================	
	public CampaignsDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}



	

//==============================================================================================
	
	public WebElement getCreatedCampaignNameText() {
		return createdCampaignNameText;
	}


	public WebElement getEditButton1() {
		return editButton1;
	}


	public WebElement getEditButton2() {
		return editButton2;
	}


	public WebElement getDeleteButton1() {
		return deleteButton1;
	}
	

	public WebElement getCloneButton1() {
		return cloneButton1;
	}





	public WebElement getDeleteButton2() {
		return deleteButton2;
	}
}
