package com.zoho.testscript;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.zoho.generic.BaseClass;
import com.zoho.generic.FileLib;
import com.zoho.pom.CampaignsDetailsPage;
import com.zoho.pom.CampaignsPage;
import com.zoho.pom.CloneCampaignPage;
import com.zoho.pom.CreateCampaignPage;
import com.zoho.pom.EditCampaignPage;
import com.zoho.pom.HomePage;

public class CampaignModule extends BaseClass{
	
	@Test(priority = 1, groups = {"Smoke", "Regression"})
	public void createCampaign() throws InterruptedException, EncryptedDocumentException, IOException {
		Reporter.log("Create Campaign", true);
		FileLib f = new FileLib();
		
		
		HomePage h = new HomePage(driver);
		h.getCampaignsModule().click();
	
		CampaignsPage c = new CampaignsPage(driver);
		c.getNewCampaignButton().click();
		
		
		//Populating all the components with values
		CreateCampaignPage c1 = new CreateCampaignPage(driver);
		c1.getCampaignNameTbx().sendKeys(f.getExcelData("CreateCampaigns", 1, 2));
		c1.getStartDateTbx().sendKeys(f.getExcelData("CreateCampaigns", 1, 3));
		c1.getExpectedRevTbx().sendKeys(f.getExcelData("CreateCampaigns", 1, 4));
		c1.getActualCostTbx().sendKeys(f.getExcelData("CreateCampaigns", 1, 5));
		c1.getNumSentTbx().sendKeys(f.getExcelData("CreateCampaigns", 1, 6));
		c1.getEndDateTbx().sendKeys(f.getExcelData("CreateCampaigns", 1, 7));
		c1.getBudgetedCostTbx().sendKeys(f.getExcelData("CreateCampaigns", 1, 8));
		c1.getExpectedResponseTbx().sendKeys(f.getExcelData("CreateCampaigns", 1, 9));
		
		Select s1 = new Select(c1.getTypeDropDownList());
		s1.selectByVisibleText(f.getExcelData("CreateCampaigns", 1, 10));
		
		Select s2 = new Select(c1.getStatusDropDownList());
		s2.selectByVisibleText(f.getExcelData("CreateCampaigns", 1, 11));
		
		//clicking on save button
		c1.getSaveBtn1().click();
		
		//Comparing the expected and actual result
		CampaignsDetailsPage cd = new CampaignsDetailsPage(driver);
		String aCampName = cd.getCreatedCampaignNameText().getText();
		String eCampName = f.getExcelData("CreateCampaigns", 1, 2);
		
		 Assert.assertEquals(aCampName, eCampName);
		}	
	
	
	@Test(priority = 2, groups = {"Smoke", "Regression"})
	public void editCampaign() throws EncryptedDocumentException, IOException, InterruptedException {
		Reporter.log("Edit Campaign", true);
		FileLib f = new FileLib();
		CampaignsDetailsPage cd = new CampaignsDetailsPage(driver);
		cd.getEditButton1().click();
		EditCampaignPage e = new EditCampaignPage(driver);
		e.getCampaignNameTbx().clear();
		e.getCampaignNameTbx().sendKeys(f.getExcelData("CreateCampaigns", 2, 2));
		e.getSaveBtn2().click();
		String aCampaignName = cd.getCreatedCampaignNameText().getText();
		String eCampaignName = f.getExcelData("CreateCampaigns", 2, 2);
		Thread.sleep(5000);
		
		Assert.assertEquals(aCampaignName, eCampaignName);
		}
	
	
	@Test(priority = 3, groups =  "Regression")
	public void cloneCampaign() throws EncryptedDocumentException, IOException, InterruptedException {
		Reporter.log("Clone Campaign", true);
		FileLib f = new FileLib();
		CampaignsDetailsPage cd = new CampaignsDetailsPage(driver);
		cd.getCloneButton1().click();
		CloneCampaignPage ccp = new CloneCampaignPage(driver);
		ccp.getCampaignNameTbx().clear();
		ccp.getCampaignNameTbx().sendKeys(f.getExcelData("CreateCampaigns", 3, 2));
		ccp.getSaveBtn1().click();
		String aCampaignName = cd.getCreatedCampaignNameText().getText();
		String eCampaignName = f.getExcelData("CreateCampaigns", 3, 2);
		Thread.sleep(5000);
		Assert.assertEquals(aCampaignName, eCampaignName);
		}
	
	
	@Test(priority = 4, groups =  {"Smoke", "Regression"})
	public void deleteCampaign() throws EncryptedDocumentException, IOException {
		Reporter.log("DeleteCampaign", true);
		FileLib f = new FileLib();
		CampaignsDetailsPage c = new CampaignsDetailsPage(driver);
		c.getDeleteButton1().click();
		driver.switchTo().alert().accept();
		CampaignsPage cp = new CampaignsPage(driver);
		String cname1 = cp.getCampaignNameInTheList().getText();
		String cname2 = f.getExcelData("CreateCampaigns", 3, 2);
		Assert.assertNotEquals(cname1, cname2);
		
		}
	

}
