package com.zoho.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCampaignPage {

// Crearte Campaign page all the components
	@FindBy(name = "property(Campaign Name)")
	private WebElement campaignNameTbx;
	
	
	@FindBy(name = "property(Start Date)")
	private WebElement startDateTbx;
	
	@FindBy(name = "property(Expected Revenue)")
	private WebElement expectedRevTbx;
	
	@FindBy(name = "property(Actual Cost)")
	private WebElement actualCostTbx;
	
	@FindBy(name = "property(Num sent)")
	private WebElement numSentTbx;
	
	@FindBy(name = "property(Type)")
	private WebElement typeDropDownList;
	
	@FindBy(name = "property(Status)")
	private WebElement statusDropDownList;
	
	@FindBy(name = "property(End Date)")
	private WebElement endDateTbx;
	
	@FindBy(name = "property(Budgeted Cost)")
	private WebElement budgetedCostTbx;
	
	@FindBy(name = "property(Expected Response)")
	private WebElement expectedResponseTbx;
	
	@FindBy(xpath = "(//input[@value = 'Save'])[1]")
	private WebElement saveBtn1;
	
	@FindBy(xpath = "(//input[@value = 'Save'])[2]")
	private WebElement saveBtn2;
	
	@FindBy(xpath = "(//input[@value = 'Save & New'])[1]")
	private WebElement saveAndNewBtn1;
	
	@FindBy(xpath = "(//input[@value = 'Save & New'])[2]")
	private WebElement saveAndNewBtn2;
	
	@FindBy(xpath = "(//input[@value = 'Cancel'])[1]")
	private WebElement cancelBtn1;
	
	@FindBy(xpath = "(//input[@value = 'Cancel'])[1]")
	private WebElement cancelBtn2;
	
	
	
//===============================================================================================
	
	
	public CreateCampaignPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

//===============================================================================================

	public WebElement getCampaignNameTbx() {
		return campaignNameTbx;
	}



	public WebElement getStartDateTbx() {
		return startDateTbx;
	}



	public WebElement getExpectedRevTbx() {
		return expectedRevTbx;
	}



	public WebElement getActualCostTbx() {
		return actualCostTbx;
	}



	public WebElement getNumSentTbx() {
		return numSentTbx;
	}



	public WebElement getTypeDropDownList() {
		return typeDropDownList;
	}



	public WebElement getStatusDropDownList() {
		return statusDropDownList;
	}



	public WebElement getEndDateTbx() {
		return endDateTbx;
	}



	public WebElement getBudgetedCostTbx() {
		return budgetedCostTbx;
	}



	public WebElement getExpectedResponseTbx() {
		return expectedResponseTbx;
	}



	public WebElement getSaveBtn1() {
		return saveBtn1;
	}



	public WebElement getSaveBtn2() {
		return saveBtn2;
	}



	public WebElement getSaveAndNewBtn1() {
		return saveAndNewBtn1;
	}



	public WebElement getSaveAndNewBtn2() {
		return saveAndNewBtn2;
	}



	public WebElement getCancelBtn1() {
		return cancelBtn1;
	}

	public WebElement getCancelBtn2() {
		return cancelBtn2;
	}


	

	
	
//===============================================================================================
	
	
	
	
	
	
	
	
}
