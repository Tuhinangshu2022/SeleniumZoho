package com.zoho.testscript;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.zoho.generic.BaseClass;
import com.zoho.generic.FileLib;
import com.zoho.pom.CampaignsPage;
import com.zoho.pom.CreateCampaignPage;
import com.zoho.pom.HomePage;
public class CampaignModuleFT extends BaseClass{
	
	@Test(priority = 1)
	public void CampaignNameFT() throws EncryptedDocumentException, IOException{
		FileLib f = new FileLib();
		HomePage h = new HomePage(driver);
		h.getCampaignsModule().click();
		CampaignsPage c = new CampaignsPage(driver);
		c.getNewCampaignButton().click();
		CreateCampaignPage ccp = new CreateCampaignPage(driver);
		
		//Positive Cases
		for(int i = 1; i<=4; i++) {
		
		String cname = f.getExcelData("CampaignModuleFT", i, 2);
		ccp.getCampaignNameTbx().sendKeys(cname);
		ccp.getSaveBtn1();
		}	
		//Negetive Cases
		
		
	}

}
