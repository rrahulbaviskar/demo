package PageObeject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathRagisterPage {
	public WebDriver driver;
	
	private	By Myaccount =By.xpath("//a[@title='My Account']");
	
	private	By Ragister =By.xpath("//li/a[contains(text(),'Register')]");
	
	
	private		By FN =By.xpath("//input[@id='input-firstname']"); //input[@id='input-firstname']
	
	private		By LN =By.xpath("//input[@id='input-lastname']");
	
	private		By EMAIL =By.xpath("//input[@id='input-email']");
	
	private	By TELPHONE =By.xpath("//input[@id='input-telephone']");
	
	private		By PASS =By.xpath("//input[@id='input-password']");
	
	private		By CONF =By.xpath("//input[@id='input-confirm']");
	
	private	By CON =By.xpath("//input[@value='Continue']");
	
	
	
	
	
	
	
	public XpathRagisterPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver2;
	}

	public WebElement Myaccount() {
		
		return driver.findElement(Myaccount);
		
		
	}
	
    public WebElement Ragister() {
		
		return driver.findElement(Ragister);
		
		
		
	}
	
public WebElement FN() {
		
		return driver.findElement(FN);
}
	

public WebElement LN() {
	
	return driver.findElement(LN);
}

public WebElement EMAIL() {
	
	return driver.findElement(EMAIL);
}

public WebElement TELPHONE() {
	
	return driver.findElement(TELPHONE);
}

public WebElement PASS() {
	
	return driver.findElement(PASS);
}

public WebElement CONF() {
	
	return driver.findElement(CONF);
}


public WebElement CON() {
	
	return driver.findElement(CON);
}



}
