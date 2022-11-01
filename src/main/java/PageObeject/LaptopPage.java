package PageObeject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LaptopPage {
	public WebDriver driver;

private	By lapName =By.xpath("(//a[@class='dropdown-toggle'])[3]");
	
	
	
	public LaptopPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}



	public WebElement lapName() {
		return driver.findElement(lapName);
	}
	
}
