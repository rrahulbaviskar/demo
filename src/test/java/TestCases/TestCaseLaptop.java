package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObeject.LaptopPage;
import Resources.BaseClass;

public class TestCaseLaptop extends BaseClass {
	@Test
	public void open() throws IOException {
		
		//browserlunch();
	//	driver.get(prop.getProperty("url"));
		
		 LaptopPage lpp=new  LaptopPage(driver);
		 lpp.lapName().click();
		 
		
		
	}

}
