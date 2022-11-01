package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObeject.XpathRagisterPage;
import Resources.BaseClass;
import Resources.TestCaseData;

public class RagisterTestCase extends BaseClass {
	// public WebDriver driver;
	@Test
	public void Ragiter() throws IOException {
		
		
	//	browserlunch();
	//	driver.get(prop.getProperty("url"));
		
		
		
		
		 XpathRagisterPage xrp=new  XpathRagisterPage (driver);
		 
		 xrp.Myaccount().click();
		 xrp.Ragister().click();
		 
		 xrp.FN().sendKeys(TestCaseData.FN);
		 xrp.LN().sendKeys(TestCaseData.LN);
		 xrp.EMAIL().sendKeys(TestCaseData.EMIL);
		 xrp.TELPHONE().sendKeys(TestCaseData.TELPHONE);
		 xrp.PASS().sendKeys(TestCaseData.PASS);
		 xrp.CONF().sendKeys(TestCaseData.CONF);
		 xrp.CON().click();
		 
		 String Expected="Warning: You must agree to the Privacy Policy!";
			String Aactual= driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
			
		 
		  SoftAssert assertion=new SoftAssert();
		    assertion.assertEquals(Aactual, Expected);
		   // System.out.println("Hello");
		    assertion.assertAll();
		 
		
	}
	
	

}
